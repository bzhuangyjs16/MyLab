import com.wildCrane.reliability.parser.imp.*;
import org.junit.Test;
import com.wildCrane.reliability.ReliabilityParser;
import com.wildCrane.reliability.entity.ReliabilityParserResult;
import com.wildCrane.reliability.entity.rf.TRFRawRelResult;
import com.wildCrane.reliability.entity.rf.TRFSummResult;
import com.wildCrane.reliability.parser.imp.*;
import com.wildCrane.reliability.parser.*;

public class ParserTest {
    @Test
    public void testParser(){
        String path = "d://";
        // 保存解析结果
        ReliabilityParserResult reliabilityParserResult = new ReliabilityParserResult();
        // 解析File得到FileResult
        FileParser fileParser = new RFFileParser();
        // 解析Run得到RunResult
        RunRecordParser runRecordParser = new RFRunRecordParser();
        // 解析excel文件得到rawResult
        RawRelResultParser rawRelResultParser = new RFRawRelResultParser();
        // 二次计算得到summResult
        SummResultParser summResultParser = new RFSummResultParser();
        // 向数据库保存解析结果
        SaveRelParserResult saveRelParserResult = new SaveRFParserResult();
        ReliabilityParser.setPath(path,reliabilityParserResult).setFileResult(fileParser)
                .setRunRecordResult(runRecordParser)
                .setRawRelResult(rawRelResultParser)
                .setSmmResults(summResultParser).save(saveRelParserResult);
    }
}
