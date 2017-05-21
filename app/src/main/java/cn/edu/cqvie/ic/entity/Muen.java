package cn.edu.cqvie.ic.entity;

import java.util.List;

/**
 * Created by yuyu on 2017/5/18.
 */

public class Muen {

    /**
     * id : 2
     * name : 框架案例
     * parentId : 0
     * url :
     * icon :
     * order : 2
     * isHeader : 1
     * childMenus : [{"id":"9","name":"新功能","parentId":"2","url":"","icon":"","order":"1","isHeader":"0","childMenus":""},{"id":"10","name":"多级","parentId":"2","url":"","icon":"","order":"1","isHeader":"0","childMenus":[{"id":"11","name":"一级","parentId":"10","url":"","icon":"","order":"1","isHeader":"0","childMenus":""},{"id":"12","name":"一级","parentId":"10","url":"","icon":"","order":"1","isHeader":"0","childMenus":[{"id":"13","name":"二级","parentId":"12","url":"","icon":"","order":"1","isHeader":"0","childMenus":""},{"id":"14","name":"二级","parentId":"12","url":"","icon":"","order":"1","isHeader":"0","childMenus":[{"id":"15","name":"三级","parentId":"14","url":"","icon":"","order":"1","isHeader":"0","childMenus":""},{"id":"16","name":"三级","parentId":"14","url":"","icon":"","order":"1","isHeader":"0","childMenus":[{"id":"17","name":"四级","parentId":"16","url":"","icon":"","order":"1","isHeader":"0","childMenus":""},{"id":"18","name":"四级","parentId":"16","url":"","icon":"","order":"1","isHeader":"0","childMenus":""}]}]}]}]}]
     */

    private String id;
    private String name;
    private String parentId;
    private String url;
    private String icon;
    private String order;
    private String isHeader;
    private List<ChildMenusBean> childMenus;

    public static class ChildMenusBean {
        /**
         * id : 9
         * name : 新功能
         * parentId : 2
         * url :
         * icon :
         * order : 1
         * isHeader : 0
         * childMenus :
         */
        private String id;
        private String name;
        private String parentId;
        private String url;
        private String icon;
        private String order;
        private String isHeader;
        private String childMenus;
    }
}
