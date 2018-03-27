package mybatis.mappers;

import mybatis.model.nyt.internal.NYTOverview;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NYTMapper {


    /**
    INSERT INTO `mybatis-test`.`nyt_summary`(`id`, `headline`, `imageUrl`, `summary`, `date`)
    VALUES(<{id: }>, <{headline: }>, <{imageUrl: }>, <{summary: }>, <{date: }>);
    **/
    String INSERT_SUMMARY = ("INSERT INTO `mybatis-test`.`nyt_summary` " +
                             "VALUES #{headLine}, #{imageUrl}, #{summary}, #{date});\");");

    @Insert(INSERT_SUMMARY)
    public int insertSummary(NYTOverview result);

}
