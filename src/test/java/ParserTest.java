import org.junit.Test;
import reliability.ReliabilityParser;
import reliability.imp.*;
import reliability.parser.*;

public class ParserTest {
    @Test
    public void testParser(){
        String path = "d://";
        // 向数据库保存解析结果
        SaveRelParserResult relParserResult = new SaveRFParserResult();
        // 解析File得到FileResult
        FileParser fileParser = new RFFileParser();
        // 解析Run得到RunResult
        RunRecordParser runRecordParser = new RFRunRecordParser();
        // 解析excel文件得到rawResult
        RawRelResultParser rawRelResultParser = new RFRawRelResultParser();
        // 二次计算得到summResult
        SummResultParser summResultParser = new RFSummResultParser();
        ReliabilityParser.setPath(path).setFileResult(fileParser)
                .setRunRecordResult(runRecordParser)
                .setRawRelResult(rawRelResultParser)
                .setSmmResults(summResultParser).save(relParserResult);
    }
}
