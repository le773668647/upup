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

    public  void readExcel() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/home/liangze/Desktop/item.xlsx");
        } catch (Exception e) {
            logger.error("read excel error",e);
        }
        List<Object> rows = EasyExcelFactory.read(fis, new Sheet(1, 0));
        logger.info("rows = {}", rows);
    }

    public static void main(String[] args) {
        ExcelOperation excelOperation = new ExcelOperation();
        excelOperation.readExcel();
    }

}
