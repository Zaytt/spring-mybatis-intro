package mybatis.mappers;

import mybatis.model.market.pojos.Sector;
import org.apache.ibatis.annotations.Select;

public interface MarketMapper {

    String SELECT_RANK =   "SELECT * FROM `Market`.`sectors_perf` " +
                            "WHERE timeframe = #{tf}";

    @Select(SELECT_RANK)
    public Sector[] getSectorRank(String tf);


}
