package io.xujiaji.dmlib.barrage;

/*
 * Copyright 2016 xujiaji
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class BarrageEntity {
    private String pname;
    private String chatStr;
    private String pic;
    private boolean isLive;

    public BarrageEntity(String pname, String chatStr, String pic) {
        this.pname = pname;
        this.chatStr = chatStr;
        this.pic = pic;
        isLive = true;
    }

    public void change(String pname, String chatStr, String pic) {
        this.pname = pname;
        this.chatStr = chatStr;
        this.pic = pic;
        isLive = true;
    }

    public void over() {
        isLive = false;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getChatStr() {
        return chatStr;
    }

    public void setChatStr(String chatStr) {
        this.chatStr = chatStr;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
