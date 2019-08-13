package code00000001.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity //声明实体类
@Table(name = "cst_Customer") //建立实体类和表的映射关系
public class Customer {
    @Id //声明主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //配置主键的生成策略
    @Column(name = "cust_id") //指定和表中字段的映射关系
    private Long id;
    @Column(name = "cust_name")
    private String name;
    @Column(name = "cust_source")
    private String source;
    @Column(name = "cust_industry")
    private String industry;
    @Column(name = "cust_level")
    private String level;
    @Column(name = "cust_address")
    private String address;
    @Column(name = "cust_phone")
    private String phone;

    //配置1对多映射，1个客户对应多个联系人
    /*@OneToMany(targetEntity = LinkMan.class)
    @JoinColumn(name = "lkm_cust_id",referencedColumnName = "cust_id")*/

    //放弃外键维护的配置
    @OneToMany(mappedBy = "customer")
    private Set<LinkMan> linkMEN = new HashSet<>();
}
