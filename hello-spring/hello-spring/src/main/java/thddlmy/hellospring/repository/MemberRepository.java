package thddlmy.hellospring.repository;

import thddlmy.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    // 회원 저장 -> 저장회원 반환
    Optional<Member> findById(Long id);
    // id로 멤버 반환
    Optional<Member> findByName(String name);
    // 이름으로 멤버 반환
    // Optional
    // 만약 멤버가 없다면 null인데 ~ 이걸 null로 반환하기보단
    // optional로 감싸서 반환함!
    List<Member> findAll();
    // 저장된 모든 멤버를 반환
}
