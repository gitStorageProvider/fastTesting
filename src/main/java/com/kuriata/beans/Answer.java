package com.kuriata.beans;

import java.io.Serializable;

public class Answer extends BaseEntity {

    private int questionId;
    private boolean item1, item2, item3, item4;
    private boolean submited;

    public Answer(int questionId, boolean item1, boolean item2, boolean item3, boolean item4) {
        this.questionId = questionId;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.submited = true;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public boolean isItem1() {
        return item1;
    }

    public void setItem1(boolean item1) {
        this.item1 = item1;
    }

    public boolean isItem2() {
        return item2;
    }

    public void setItem2(boolean item2) {
        this.item2 = item2;
    }

    public boolean isItem3() {
        return item3;
    }

    public void setItem3(boolean item3) {
        this.item3 = item3;
    }

    public boolean isItem4() {
        return item4;
    }

    public void setItem4(boolean item4) {
        this.item4 = item4;
    }

    public boolean isSubmited() {
        return submited;
    }

    public void setSubmited(boolean submited) {
        this.submited = submited;
    }
}
