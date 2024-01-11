/*
 * This file is generated by jOOQ.
 */
package gim.mysql.jooq.model.test.tables;


import gim.mysql.jooq.model.test.Keys;
import gim.mysql.jooq.model.test.Test;
import gim.mysql.jooq.model.test.tables.records.MemberRecord;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * 회원 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Member extends TableImpl<MemberRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>test.member</code>
     */
    public static final Member MEMBER = new Member();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemberRecord> getRecordType() {
        return MemberRecord.class;
    }

    /**
     * The column <code>test.member.member_id</code>. 회원 아이디
     */
    public final TableField<MemberRecord, UInteger> MEMBER_ID = createField(DSL.name("member_id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "회원 아이디");

    /**
     * The column <code>test.member.member_name</code>. 회원 이름
     */
    public final TableField<MemberRecord, String> MEMBER_NAME = createField(DSL.name("member_name"), SQLDataType.VARCHAR(100).nullable(false), this, "회원 이름");

    /**
     * The column <code>test.member.member_active</code>. 회원 활성화 여부
     */
    public final TableField<MemberRecord, String> MEMBER_ACTIVE = createField(DSL.name("member_active"), SQLDataType.VARCHAR(3).nullable(false), this, "회원 활성화 여부");

    /**
     * The column <code>test.member.created_time</code>. 등록시간
     */
    public final TableField<MemberRecord, LocalDateTime> CREATED_TIME = createField(DSL.name("created_time"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "등록시간");

    /**
     * The column <code>test.member.updated_time</code>. 수정시간
     */
    public final TableField<MemberRecord, LocalDateTime> UPDATED_TIME = createField(DSL.name("updated_time"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "수정시간");

    private Member(Name alias, Table<MemberRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Member(Name alias, Table<MemberRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("회원 테이블"), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>test.member</code> table reference
     */
    public Member(String alias) {
        this(DSL.name(alias), MEMBER);
    }

    /**
     * Create an aliased <code>test.member</code> table reference
     */
    public Member(Name alias) {
        this(alias, MEMBER);
    }

    /**
     * Create a <code>test.member</code> table reference
     */
    public Member() {
        this(DSL.name("member"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Test.TEST;
    }

    @Override
    public Identity<MemberRecord, UInteger> getIdentity() {
        return (Identity<MemberRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<MemberRecord> getPrimaryKey() {
        return Keys.KEY_MEMBER_PRIMARY;
    }

    @Override
    public Member as(String alias) {
        return new Member(DSL.name(alias), this);
    }

    @Override
    public Member as(Name alias) {
        return new Member(alias, this);
    }

    @Override
    public Member as(Table<?> alias) {
        return new Member(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Member rename(String name) {
        return new Member(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Member rename(Name name) {
        return new Member(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Member rename(Table<?> name) {
        return new Member(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Member where(Condition condition) {
        return new Member(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Member where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Member where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Member where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Member where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Member where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Member where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Member where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Member whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Member whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
