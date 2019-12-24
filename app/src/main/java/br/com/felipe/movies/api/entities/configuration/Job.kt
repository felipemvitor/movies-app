package br.com.felipe.movies.api.entities.configuration

class Job {

    var department: String? = ""
    var jobs: ArrayList<String>? = ArrayList()

    override fun toString(): String {
        return "Job(department=$department, jobs=$jobs)"
    }
}