<template>
  <v-app>
    <v-main>
      <LoginHome/>
    </v-main>
  </v-app>
</template>

<script lang="ts">
import LoginHome from './components/login/LoginHome.vue';
export default {
  name: 'App',
  components: {
    LoginHome
  }
}
</script>
