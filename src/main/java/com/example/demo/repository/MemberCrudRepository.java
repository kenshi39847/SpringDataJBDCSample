package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Member;


// Memberテーブル：リポジトリ
public interface MemberCrudRepository extends CrudRepository<Member, Integer> {

}
