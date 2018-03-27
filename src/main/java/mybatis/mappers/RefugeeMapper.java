package mybatis.mappers;

import org.apache.ibatis.annotations.Select;

public interface RefugeeMapper {

    String GET_ALL_REFUGEES_FROM = "SELECT SUM(refugees) FROM `mybatis-test`.`refugees_all` " +
                                    "WHERE origin_country = #{country}";

    @Select(GET_ALL_REFUGEES_FROM)
    public int getAllRefugeesFrom(String country);
}
