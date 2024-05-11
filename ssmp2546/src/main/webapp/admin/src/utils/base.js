const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmp2546/",
            name: "ssmp2546",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmp2546/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "综合文化信息管理系统小程序"
        } 
    }
}
export default base
