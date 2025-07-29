package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import hello.hello_spring.repository.MemoryMemberRepsitory;
import java.util.List;

public class MemoryMemberRepsitoryTest {

    MemberRepository repository = new MemoryMemberRepsitory();

    //@AfterEach // 스프링안에 케이스마다 중복되는값이 있어서 오류발생가능 하기때문에 이걸 만들어야됨
   // public void afterEach() {
     //   repository.clearStore();
   // }
    @Test
    public void save(){


        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        Assertions.assertThat(member).isEqualTo(result); // member 가 result랑 같으면 반환 Assertions 는 static

    }
    @Test
    public void findByName(){

        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();

        Assertions.assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();
        Assertions.assertThat(result.size()).isEqualTo(2);

    }
}
