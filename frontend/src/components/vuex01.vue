<template>
  <div>
    <h1>Vuex 01</h1>

    <p>{{ count }}</p>
    <p>
      <b-btn-group>
        <b-btn variant="info" @click="increment">+</b-btn>
        <b-btn variant="primary" @click="decrement">-</b-btn>
      </b-btn-group>
    </p>

  </div>
</template>

<script>
export default {
  name: 'vuex01',
  data () {
    return {
    }
  },
  computed: {
    count () {
      return this.$store.state.count
    }
  },
  methods: {
    increment () {
      this.$store.commit('increment')
    },
    decrement () {
      this.$store.commit('decrement')
    }
  }
}
</script>