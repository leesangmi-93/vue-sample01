<template>
  <div>
    <h1>Vuex 03</h1>

    <p>item count: {{ count }}</p>
    <p>
      <b-form-group id="input-group-1" label="Your Name:" label-for="input-1">
        <b-form-input id="input-1"
                      v-model="form.name"
                      placeholder="Enter Name"
                      required
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-2" label="Favorite Language:" label-for="input-2">
        <b-form-input id="input-2"
                      v-model="form.lang"
                      placeholder="Enter Language"
                      required
        ></b-form-input>
      </b-form-group>
    </p>

    <p>
      <b-btn-group>
        <b-btn variant="info" @click="increment();addItem({name:form.name,lang:form.lang})">Add</b-btn>
        <b-btn variant="primary" @click="clearItem">Clear</b-btn>
        <b-btn variant="danger" @click="decrement();removeItem(form.name)">Remove</b-btn>
      </b-btn-group>
    </p>
    <div>리스트 수 : {{count}}</div>
    <div v-for="(item, index) in items" :key="index" class="mb-2">
      {{ item.name }} | {{ item.lang }}
    </div>
  </div>
</template>

<script>
import { mapState, mapGetters,mapActions, mapMutations } from 'vuex'
export default {
  name: 'vuex03',
  data () {
    return {
      form: {}
    }
  },
  computed: {   // computed는 getter랑 state
    ...mapGetters([
      'itemsCount'
    ]),
    ...mapState([
       'count'
    ]),
    ...mapState([
      'items'
    ])
    // count () {
    //   return this.$store.getters.itemsCount
    // },
    // items () {
    //   return this.$store.state.items
    // }
  },
  methods: {    // methods는 mutations랑 actions

    // addItem () {
    //   this.$store.commit('increment')
    //   this.$store.dispatch('addItem', {
    //     name: this.form.name,
    //     lang: this.form.lang
    //   })
    // },
    ...mapActions([
      'addItem'
    ]),
    clearItem () {
      this.form = {}
    }

    // ,
    // removeItem () {
    //   // this.$store.commit('decrement')
    //   this.$store.commit('removeItem', this.form.name)
    //
    // }

    , ...mapMutations([
      'removeItem','increment','decrement'

    ]),
  }
}
</script>