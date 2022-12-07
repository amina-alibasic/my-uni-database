<template>
  <v-app>
    <v-main class="main">
      <Login/>
    </v-main>
  </v-app>
</template>

<script lang="ts">
import Login from './components/login/Login.vue';
export default {
  name: 'App',
  components: {
    Login
  }
}
</script>


<style scoped>
.main {
    background-color: slateblue;
    height: 100vh;
}
</style>