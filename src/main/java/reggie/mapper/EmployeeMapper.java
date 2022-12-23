package reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import reggie.entity.Employee;

/**
 * @author chris
 * @date 2022-12-23
 * 描述:  ***
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
