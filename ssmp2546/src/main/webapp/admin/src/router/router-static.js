import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import wenzhangleixing from '@/views/modules/wenzhangleixing/list'
    import xinwenzixun from '@/views/modules/xinwenzixun/list'
    import wenhuazhanshi from '@/views/modules/wenhuazhanshi/list'
    import huiyuan from '@/views/modules/huiyuan/list'
    import wenhualeixing from '@/views/modules/wenhualeixing/list'
    import storeup from '@/views/modules/storeup/list'
    import discusswenzhangxinxi from '@/views/modules/discusswenzhangxinxi/list'
    import discussxinwenzixun from '@/views/modules/discussxinwenzixun/list'
    import discusswenhuazhanshi from '@/views/modules/discusswenhuazhanshi/list'
    import messages from '@/views/modules/messages/list'
    import xinwenleixing from '@/views/modules/xinwenleixing/list'
    import wenzhangxinxi from '@/views/modules/wenzhangxinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/wenzhangleixing',
        name: '文章类型',
        component: wenzhangleixing
      }
      ,{
	path: '/xinwenzixun',
        name: '新闻资讯',
        component: xinwenzixun
      }
      ,{
	path: '/wenhuazhanshi',
        name: '文化展示',
        component: wenhuazhanshi
      }
      ,{
	path: '/huiyuan',
        name: '会员',
        component: huiyuan
      }
      ,{
	path: '/wenhualeixing',
        name: '文化类型',
        component: wenhualeixing
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/discusswenzhangxinxi',
        name: '文章信息评论',
        component: discusswenzhangxinxi
      }
      ,{
	path: '/discussxinwenzixun',
        name: '新闻资讯评论',
        component: discussxinwenzixun
      }
      ,{
	path: '/discusswenhuazhanshi',
        name: '文化展示评论',
        component: discusswenhuazhanshi
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/xinwenleixing',
        name: '新闻类型',
        component: xinwenleixing
      }
      ,{
	path: '/wenzhangxinxi',
        name: '文章信息',
        component: wenzhangxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
