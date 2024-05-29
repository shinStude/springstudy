package hello.core.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();
    @Test
    void Join() {

        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.Join(member);
        Member findMember = memberService.findMember(1L);


        //then
        org.assertj.core.api.Assertions.assertThat(member).isEqualTo(findMember);

    }

}
