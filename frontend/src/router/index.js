import Vue from 'vue'
import VueRouter from 'vue-router'
import Layout from '@/layout/Layout'
import NotFound from '@/components/NotFound'

Vue.use(VueRouter)

const routes = [{
  path: '/',
  name: 'main',
  component: Layout,
  children: [{
    path: 'hello',
    name: 'HelloWorld',
    component: () => import('@/components/HelloWorld')
  }, {
    path: 'cho',
    name: 'HelloWorld',
    component: () => import('@/components/Cho')
  }, {
    path: '*',
    component: NotFound
  }]
}]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
