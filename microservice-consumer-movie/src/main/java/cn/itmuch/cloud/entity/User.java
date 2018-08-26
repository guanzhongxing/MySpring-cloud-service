package cn.itmuch.cloud.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/8/19 0019.
 */
public class User implements Serializable {
    private Long id;
    private String username;
    private String name;
    private Short age;
    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Short getAge() {
        return age;
    }

    public User setAge(Short age) {
        this.age = age;
        return this;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public User setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}
