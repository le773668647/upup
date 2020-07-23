package excelOperation;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.util.List;

/**
 * @author liangze
 * @create 2020-07-23 下午3:38
 */
public class ExcelOperation {

    private final Logger logger = LoggerFactory.getLogger(ExcelOperation.class);

    /**
     * 快捷读入excel文件,
     * @param sheetNo 表,指的是每个excel的sheet数,当输入参数在sheet范围内,则读取对应sheet,index从1开始
     *                例如,当前excel共2个sheet,参数为1时,读取第一个sheet,不满足时,读取所有
     * @param headLineMun 表头开始位置index从0开始      例,0读取表头 1直接读取第一行
     */
    public  void readExcel(int sheetNo, int headLineMun) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/home/liangze/Desktop/item.xlsx");
        } catch (Exception e) {
            logger.error("read excel error",e);
        }
        List<Object> rows = EasyExcelFactory.read(fis, new Sheet(sheetNo, headLineMun));
        logger.info("rows = {} ", rows);
        logger.info("row size = {}",rows.size());
    }

    public static void main(String[] args) {
        ExcelOperation excelOperation = new ExcelOperation();
        //读取所有sheet 从第二行开始,不包括表头
        excelOperation.readExcel(0,1);
    }

}
