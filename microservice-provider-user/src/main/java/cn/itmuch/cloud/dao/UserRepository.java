package cn.itmuch.cloud.dao;

import cn.itmuch.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/8/19 0019.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
