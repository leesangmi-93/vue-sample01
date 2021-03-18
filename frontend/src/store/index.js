import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    count: 0,
    items: []
  },
  getters: {
    itemsCount (state) {
      return state.items.length
    }
  },
  mutations: {
    increment: state => state.count++,
    decrement: state => state.count--,
    setItem (state, item) {
      state.items.push(item)
    },
    removeItem (state, name) {
      const idx = state.items.findIndex(item => item.name === name)
      state.items.splice(idx, 1)
    }
  },
  actions: {
    addItem ({commit}, item) {
      commit('setItem', item)
    }
  }
})
