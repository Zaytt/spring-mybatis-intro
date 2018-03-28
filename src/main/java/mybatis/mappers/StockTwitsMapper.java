package mybatis.mappers;

import mybatis.model.User;
import mybatis.model.stocktwits.analyze.TickerSentiment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface StockTwitsMapper {

    String GET_TICKER_SENTIMENT_PK = "SELECT * FROM `Stocktwits`.sentiment where ticker = #{arg0} AND " +
                                        "datetime = #{arg1}";
    String GET_TICKER_SENTIMENT_HISTORY = "SELECT * FROM `Stocktwits`.sentiment where ticker = #{ticker}";
    String INSERT_SENTIMENT = "INSERT INTO `Stocktwits`.sentiment (ticker, datetime, name, bullishcount, bearishcount, " +
                                                                   "sentimentRating) " +
            "VALUES (#{ticker}, #{datetime}, #{name}, #{bullishcount}, #{bearishcount},#{sentimentRating})";

    @Select(GET_TICKER_SENTIMENT_PK)
    public TickerSentiment getTickerSentimentByPK(String ticker, String datetime);

    @Select(GET_TICKER_SENTIMENT_HISTORY)
    public ArrayList<TickerSentiment> getTickerSentimentHistory(String ticker);

    @Insert(INSERT_SENTIMENT)
    public int insertSentiment(TickerSentiment tickerSentiment);




}
