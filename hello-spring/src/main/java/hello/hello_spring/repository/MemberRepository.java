package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 말그대로 저장하는거 member객체 받아서 저장
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name); // NULL이 있을수 있으니 그거도때문에 optional 씀
    List<Member> findAll(); //모든회원 저장 리스트 반환


}
