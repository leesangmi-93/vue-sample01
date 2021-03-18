<template>
  <b-container>
    <app-layout-header/>
    Main Layout
    <router-view/>

    <app-layout-footer/>
  </b-container>
</template>

<script>
import Header from './Header'
import Footer from './Footer'

export default {
  name: 'layout',
  components: {
    'app-layout-header': Header,
    'app-layout-footer': Footer
  }
}
</script>
