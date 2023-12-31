package org.choongang.tests;

import lombok.extern.slf4j.Slf4j;
import org.choongang.entities.Member;
import org.choongang.repositories.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDateTime;
import java.util.List;
@Slf4j
@SpringBootTest
public class JdbcEx01 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private MemberRepository repository;

    @Test
    void test1() {
        List<Member> members = (List<Member>)repository.findAll();
        members.forEach(System.out::println);
    }

//    @Test
//    void test2() {
//        Member member = repository.findById(18L).orElse(null);
//
//        member.setUserNm("(수정)사용자01");
//        member.setModDt(LocalDateTime.now());
//
////        Member.builder()
////                .userNo(18L)
////                .userNm("(수정)사용자01")
////                .userId("user")
////                .modDt(LocalDateTime.now())
////                .build();
//
//        repository.save(member);
//    }

    @Test
    void test3(){
        Member member = repository.findByUserId("user01");
        log.info(member.toString());
    }

    @Test
    void test4(){
        List<Member> members = repository.findByUserNmContainingOrderByRegDtDesc("용");
        members.forEach(System.out::println);
    }

    @Test
    void test5() {
        List<Member> members = repository.getMembers("용", "Id");
        members.forEach(System.out::println);
    }

//    @Test
//    void test6(){
//        Pageable pageable = PageRequest.of(3,10, Sort.by(Sort.Order.desc("regDt"), Sort.Order.asc("userId")));
//        Page<Member> data = repository.findByUserNmContaining("용", pageable);
//
//        List<Member> members = data.getContent();
//        long total = data.getTotalElements();
//        int totalPages = data.getTotalPages();
//    }



}
