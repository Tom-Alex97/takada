package com.baizhi.entity.original;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author admin
 * @date 2024/05/26 15:04:25
 * user 
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TUser implements java.io.Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    /**
     * @TableNameuser
     * @TableRemarks 
     * @ActualColumnName id
     * @ActualColumnRemarks 
     * @ActualTypeName INT UNSIGNED
     * @isNullable false
     * @Length 10
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement true
     * @isIdentity false
     * @isStringColumn false
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName INTEGER
     * @JdbcType 4
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    /**
     * @TableNameuser
     * @TableRemarks 
     * @ActualColumnName username
     * @ActualColumnRemarks 
     * @ActualTypeName VARCHAR
     * @isNullable true
     * @Length 40
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn true
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName VARCHAR
     * @JdbcType 12
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.realname
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    /**
     * @TableNameuser
     * @TableRemarks 
     * @ActualColumnName realname
     * @ActualColumnRemarks 
     * @ActualTypeName VARCHAR
     * @isNullable true
     * @Length 60
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn true
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName VARCHAR
     * @JdbcType 12
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    /**
     * @TableNameuser
     * @TableRemarks 
     * @ActualColumnName password
     * @ActualColumnRemarks 
     * @ActualTypeName VARCHAR
     * @isNullable true
     * @Length 40
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn true
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName VARCHAR
     * @JdbcType 12
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gender
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    /**
     * @TableNameuser
     * @TableRemarks 
     * @ActualColumnName gender
     * @ActualColumnRemarks 
     * @ActualTypeName TINYINT UNSIGNED
     * @isNullable true
     * @Length 3
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn false
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName TINYINT
     * @JdbcType -6
     */
    private Byte gender;
}