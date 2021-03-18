<template>
  <div>
    <h1>Vuex 02</h1>

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
        <b-btn variant="info" @click="addItem">Add</b-btn>
        <b-btn variant="primary" @click="clearItem">Clear</b-btn>
        <b-btn variant="danger" @click="removeItem">Remove</b-btn>
      </b-btn-group>
    </p>

    <div v-for="(item, index) in items" :key="index" class="mb-2">
      {{ item.name }} | {{ item.lang }}
    </div>
  </div>
</template>

<script>
export default {
  name: 'vuex02',
  data () {
    return {
      form: {}
    }
  },
  computed: {
    count () {
      return this.$store.getters.itemsCount
    },
    items () {
      return this.$store.state.items
    }
  },
  methods: {
    addItem () {
      this.$store.dispatch('addItem', {
        name: this.form.name,
        lang: this.form.lang
      })
    },
    clearItem () {
      this.form = {}
    },
    removeItem () {
      this.$store.commit('removeItem', this.form.name)
    }
  }
}
</script>