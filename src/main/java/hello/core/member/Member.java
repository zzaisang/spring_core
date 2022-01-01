package hello.core.member;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/19
 */
public class Member {

    private Long id;

    private String name;

    private Grade grade;

    public Member(final Long id, final String name, final Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(final Grade grade) {
        this.grade = grade;
    }

}
