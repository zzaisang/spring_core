package hello.core.member;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/19
 */
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
