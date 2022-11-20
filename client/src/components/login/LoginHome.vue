<template>
    <v-container class="page">
        <div class="my-10">
        <p class="welcome"> Welcome to</p>
        <h2 class="my-uni">MyUni <span class="title">DATABASE</span></h2>
        <v-btn elevation="6" outlined width="200" height="50" class="btn">LOGIN</v-btn>
        </div>
    </v-container> 

</template>

<script setup lang="ts">

</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=JetBrains+Mono:wght@300&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Langar&display=swap');
@import url('https://fonts.googleapis.com/css2?family=PT+Mono&display=swap'); 
@import url('https://fonts.googleapis.com/css2?family=Overpass+Mono:wght@600&display=swap');

.btn {
    font-size: 20px !important;
}

.page {
    background-color: slateblue;
    height: 100vh;
}

.page {
    text-align: center;
    line-height: 20vh;
    min-width: 100vw;
}


.title {
    font-family: 'PT Mono', monospace;
    color: white;
    font-size: 64px;
}

.welcome {
    font-family: 'JetBrains Mono', monospace;
    color: white;
    font-size: 42px;
}

.my-uni {
    font-family: 'Langar', cursive;
    color: white;
    font-size: 150px;
    background-image: linear-gradient(45deg, #fafaf9, #00fa0c);
    -webkit-background-clip: text;
    background-clip: text;
    -webkit-text-fill-color: transparent;
}

/* hide scrollbar */
html {
    overflow: auto !important;
    scrollbar-width: none;
    -ms-overflow-style: none;
}

html::-webkit-scrollbar {
    width: 0;
    height: 0;
}
</style>
