<template>
    <div class="d-flex align-center justify-center fill-height">
        <v-card
        outlined
        shaped
        min-width="400"
        elevation="10"
        class="text-center pa-4"
        >
            <v-form v-model="valid" class="d-flex flex-column align-center justify-center ma-4">
                    <v-col
                    class="px-2"
                    >
                    <v-text-field
                        label="Username"
                        outlined
                        dense
                        required
                    ></v-text-field>
                    </v-col>

                    <v-col
                    class="px-2"
                    >
                    <v-text-field
                        label="Password"
                        outlined
                        dense
                        required
                    ></v-text-field>
                    </v-col>           
            </v-form>
            <v-btn
            color="teal"
            outlined
            > 
            LOGIN 
            </v-btn>
        </v-card>
    </div>
</template>

<script  lang="ts">
 export default {
    name: 'Login',
    data()  {
        return {
            valid: false
        }
    },
  }
</script>

<style scoped>


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
