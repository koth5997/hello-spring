package hello.hello_spring.controller;

import hello.hello_spring.domain.Member;
import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired // 스프링이 연관된 객체를 스프링 컨테이너에서 찾아서 넣어준다 이게 의존성 주입이다.
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping(value = "/members/new")
    public String createFore(){
        return "member/createMemberForm";
    }

    @PostMapping(value = "/members/new")
    public String create(MemberForm form){

        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/"; //끝나면 홈으로 가기
    }

    @GetMapping(value ="/members")
    public String list(Model model){
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "member/memberList";
    }
}
