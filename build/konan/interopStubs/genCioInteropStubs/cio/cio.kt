@file:Suppress("UNUSED_EXPRESSION", "UNUSED_VARIABLE")
package cio

import konan.SymbolName
import kotlinx.cinterop.*

fun __underflow(arg0: CValuesRef<_IO_FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni___underflow(_arg0)
        res
    }
}

@SymbolName("cio_kni___underflow")
private external fun kni___underflow(arg0: NativePtr): Int

fun __uflow(arg0: CValuesRef<_IO_FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni___uflow(_arg0)
        res
    }
}

@SymbolName("cio_kni___uflow")
private external fun kni___uflow(arg0: NativePtr): Int

fun __overflow(arg0: CValuesRef<_IO_FILE>?, arg1: Int): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val res = kni___overflow(_arg0, _arg1)
        res
    }
}

@SymbolName("cio_kni___overflow")
private external fun kni___overflow(arg0: NativePtr, arg1: Int): Int

fun _IO_getc(__fp: CValuesRef<_IO_FILE>?): Int {
    return memScoped {
        val ___fp = __fp?.getPointer(memScope).rawValue
        val res = kni__IO_getc(___fp)
        res
    }
}

@SymbolName("cio_kni__IO_getc")
private external fun kni__IO_getc(__fp: NativePtr): Int

fun _IO_putc(__c: Int, __fp: CValuesRef<_IO_FILE>?): Int {
    return memScoped {
        val ___c = __c
        val ___fp = __fp?.getPointer(memScope).rawValue
        val res = kni__IO_putc(___c, ___fp)
        res
    }
}

@SymbolName("cio_kni__IO_putc")
private external fun kni__IO_putc(__c: Int, __fp: NativePtr): Int

fun _IO_feof(__fp: CValuesRef<_IO_FILE>?): Int {
    return memScoped {
        val ___fp = __fp?.getPointer(memScope).rawValue
        val res = kni__IO_feof(___fp)
        res
    }
}

@SymbolName("cio_kni__IO_feof")
private external fun kni__IO_feof(__fp: NativePtr): Int

fun _IO_ferror(__fp: CValuesRef<_IO_FILE>?): Int {
    return memScoped {
        val ___fp = __fp?.getPointer(memScope).rawValue
        val res = kni__IO_ferror(___fp)
        res
    }
}

@SymbolName("cio_kni__IO_ferror")
private external fun kni__IO_ferror(__fp: NativePtr): Int

fun _IO_peekc_locked(__fp: CValuesRef<_IO_FILE>?): Int {
    return memScoped {
        val ___fp = __fp?.getPointer(memScope).rawValue
        val res = kni__IO_peekc_locked(___fp)
        res
    }
}

@SymbolName("cio_kni__IO_peekc_locked")
private external fun kni__IO_peekc_locked(__fp: NativePtr): Int

fun _IO_flockfile(arg0: CValuesRef<_IO_FILE>?): Unit {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni__IO_flockfile(_arg0)
        res
    }
}

@SymbolName("cio_kni__IO_flockfile")
private external fun kni__IO_flockfile(arg0: NativePtr): Unit

fun _IO_funlockfile(arg0: CValuesRef<_IO_FILE>?): Unit {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni__IO_funlockfile(_arg0)
        res
    }
}

@SymbolName("cio_kni__IO_funlockfile")
private external fun kni__IO_funlockfile(arg0: NativePtr): Unit

fun _IO_padn(arg0: CValuesRef<_IO_FILE>?, arg1: Int, arg2: __ssize_t): __ssize_t {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val _arg2 = arg2
        val res = kni__IO_padn(_arg0, _arg1, _arg2)
        res
    }
}

@SymbolName("cio_kni__IO_padn")
private external fun kni__IO_padn(arg0: NativePtr, arg1: Int, arg2: Long): Long

fun _IO_sgetn(arg0: CValuesRef<_IO_FILE>?, arg1: COpaquePointer?, arg2: size_t): size_t {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1.rawValue
        val _arg2 = arg2
        val res = kni__IO_sgetn(_arg0, _arg1, _arg2)
        res
    }
}

@SymbolName("cio_kni__IO_sgetn")
private external fun kni__IO_sgetn(arg0: NativePtr, arg1: NativePtr, arg2: Long): Long

fun _IO_seekoff(arg0: CValuesRef<_IO_FILE>?, arg1: __off64_t, arg2: Int, arg3: Int): __off64_t {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val _arg2 = arg2
        val _arg3 = arg3
        val res = kni__IO_seekoff(_arg0, _arg1, _arg2, _arg3)
        res
    }
}

@SymbolName("cio_kni__IO_seekoff")
private external fun kni__IO_seekoff(arg0: NativePtr, arg1: Long, arg2: Int, arg3: Int): Long

fun _IO_seekpos(arg0: CValuesRef<_IO_FILE>?, arg1: __off64_t, arg2: Int): __off64_t {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val _arg2 = arg2
        val res = kni__IO_seekpos(_arg0, _arg1, _arg2)
        res
    }
}

@SymbolName("cio_kni__IO_seekpos")
private external fun kni__IO_seekpos(arg0: NativePtr, arg1: Long, arg2: Int): Long

fun _IO_free_backup_area(arg0: CValuesRef<_IO_FILE>?): Unit {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni__IO_free_backup_area(_arg0)
        res
    }
}

@SymbolName("cio_kni__IO_free_backup_area")
private external fun kni__IO_free_backup_area(arg0: NativePtr): Unit

fun remove(__filename: String?): Int {
    return memScoped {
        val ___filename = __filename?.cstr?.getPointer(memScope).rawValue
        val res = kni_remove(___filename)
        res
    }
}

@SymbolName("cio_kni_remove")
private external fun kni_remove(__filename: NativePtr): Int

fun rename(__old: String?, __new: String?): Int {
    return memScoped {
        val ___old = __old?.cstr?.getPointer(memScope).rawValue
        val ___new = __new?.cstr?.getPointer(memScope).rawValue
        val res = kni_rename(___old, ___new)
        res
    }
}

@SymbolName("cio_kni_rename")
private external fun kni_rename(__old: NativePtr, __new: NativePtr): Int

fun renameat(__oldfd: Int, __old: String?, __newfd: Int, __new: String?): Int {
    return memScoped {
        val ___oldfd = __oldfd
        val ___old = __old?.cstr?.getPointer(memScope).rawValue
        val ___newfd = __newfd
        val ___new = __new?.cstr?.getPointer(memScope).rawValue
        val res = kni_renameat(___oldfd, ___old, ___newfd, ___new)
        res
    }
}

@SymbolName("cio_kni_renameat")
private external fun kni_renameat(__oldfd: Int, __old: NativePtr, __newfd: Int, __new: NativePtr): Int

fun tmpfile(): CPointer<FILE>? {
    val res = kni_tmpfile()
    return interpretCPointer<FILE>(res)
}

@SymbolName("cio_kni_tmpfile")
private external fun kni_tmpfile(): NativePtr

fun tmpnam(__s: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val ___s = __s?.getPointer(memScope).rawValue
        val res = kni_tmpnam(___s)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("cio_kni_tmpnam")
private external fun kni_tmpnam(__s: NativePtr): NativePtr

fun tmpnam_r(__s: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val ___s = __s?.getPointer(memScope).rawValue
        val res = kni_tmpnam_r(___s)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("cio_kni_tmpnam_r")
private external fun kni_tmpnam_r(__s: NativePtr): NativePtr

fun tempnam(__dir: String?, __pfx: String?): CPointer<ByteVar>? {
    return memScoped {
        val ___dir = __dir?.cstr?.getPointer(memScope).rawValue
        val ___pfx = __pfx?.cstr?.getPointer(memScope).rawValue
        val res = kni_tempnam(___dir, ___pfx)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("cio_kni_tempnam")
private external fun kni_tempnam(__dir: NativePtr, __pfx: NativePtr): NativePtr

fun fclose(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fclose(___stream)
        res
    }
}

@SymbolName("cio_kni_fclose")
private external fun kni_fclose(__stream: NativePtr): Int

fun fflush(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fflush(___stream)
        res
    }
}

@SymbolName("cio_kni_fflush")
private external fun kni_fflush(__stream: NativePtr): Int

fun fflush_unlocked(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fflush_unlocked(___stream)
        res
    }
}

@SymbolName("cio_kni_fflush_unlocked")
private external fun kni_fflush_unlocked(__stream: NativePtr): Int

fun fopen(__filename: String?, __modes: String?): CPointer<FILE>? {
    return memScoped {
        val ___filename = __filename?.cstr?.getPointer(memScope).rawValue
        val ___modes = __modes?.cstr?.getPointer(memScope).rawValue
        val res = kni_fopen(___filename, ___modes)
        interpretCPointer<FILE>(res)
    }
}

@SymbolName("cio_kni_fopen")
private external fun kni_fopen(__filename: NativePtr, __modes: NativePtr): NativePtr

fun freopen(__filename: String?, __modes: String?, __stream: CValuesRef<FILE>?): CPointer<FILE>? {
    return memScoped {
        val ___filename = __filename?.cstr?.getPointer(memScope).rawValue
        val ___modes = __modes?.cstr?.getPointer(memScope).rawValue
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_freopen(___filename, ___modes, ___stream)
        interpretCPointer<FILE>(res)
    }
}

@SymbolName("cio_kni_freopen")
private external fun kni_freopen(__filename: NativePtr, __modes: NativePtr, __stream: NativePtr): NativePtr

fun fdopen(__fd: Int, __modes: String?): CPointer<FILE>? {
    return memScoped {
        val ___fd = __fd
        val ___modes = __modes?.cstr?.getPointer(memScope).rawValue
        val res = kni_fdopen(___fd, ___modes)
        interpretCPointer<FILE>(res)
    }
}

@SymbolName("cio_kni_fdopen")
private external fun kni_fdopen(__fd: Int, __modes: NativePtr): NativePtr

fun fmemopen(__s: COpaquePointer?, __len: size_t, __modes: String?): CPointer<FILE>? {
    return memScoped {
        val ___s = __s.rawValue
        val ___len = __len
        val ___modes = __modes?.cstr?.getPointer(memScope).rawValue
        val res = kni_fmemopen(___s, ___len, ___modes)
        interpretCPointer<FILE>(res)
    }
}

@SymbolName("cio_kni_fmemopen")
private external fun kni_fmemopen(__s: NativePtr, __len: Long, __modes: NativePtr): NativePtr

fun open_memstream(__bufloc: CValuesRef<CPointerVar<ByteVar>>?, __sizeloc: CValuesRef<size_tVar>?): CPointer<FILE>? {
    return memScoped {
        val ___bufloc = __bufloc?.getPointer(memScope).rawValue
        val ___sizeloc = __sizeloc?.getPointer(memScope).rawValue
        val res = kni_open_memstream(___bufloc, ___sizeloc)
        interpretCPointer<FILE>(res)
    }
}

@SymbolName("cio_kni_open_memstream")
private external fun kni_open_memstream(__bufloc: NativePtr, __sizeloc: NativePtr): NativePtr

fun setbuf(__stream: CValuesRef<FILE>?, __buf: CValuesRef<ByteVar>?): Unit {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val ___buf = __buf?.getPointer(memScope).rawValue
        val res = kni_setbuf(___stream, ___buf)
        res
    }
}

@SymbolName("cio_kni_setbuf")
private external fun kni_setbuf(__stream: NativePtr, __buf: NativePtr): Unit

fun setvbuf(__stream: CValuesRef<FILE>?, __buf: CValuesRef<ByteVar>?, __modes: Int, __n: size_t): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val ___buf = __buf?.getPointer(memScope).rawValue
        val ___modes = __modes
        val ___n = __n
        val res = kni_setvbuf(___stream, ___buf, ___modes, ___n)
        res
    }
}

@SymbolName("cio_kni_setvbuf")
private external fun kni_setvbuf(__stream: NativePtr, __buf: NativePtr, __modes: Int, __n: Long): Int

fun setbuffer(__stream: CValuesRef<FILE>?, __buf: CValuesRef<ByteVar>?, __size: size_t): Unit {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val ___buf = __buf?.getPointer(memScope).rawValue
        val ___size = __size
        val res = kni_setbuffer(___stream, ___buf, ___size)
        res
    }
}

@SymbolName("cio_kni_setbuffer")
private external fun kni_setbuffer(__stream: NativePtr, __buf: NativePtr, __size: Long): Unit

fun setlinebuf(__stream: CValuesRef<FILE>?): Unit {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_setlinebuf(___stream)
        res
    }
}

@SymbolName("cio_kni_setlinebuf")
private external fun kni_setlinebuf(__stream: NativePtr): Unit

fun fprintf(__stream: CValuesRef<FILE>?, __format: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_fprintf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__stream, __format), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("cio_kni_fprintf")
private external fun kni_fprintf(): NativePtr

fun printf(__format: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_printf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__format), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("cio_kni_printf")
private external fun kni_printf(): NativePtr

fun sprintf(__s: CValuesRef<ByteVar>?, __format: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_sprintf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__s, __format), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("cio_kni_sprintf")
private external fun kni_sprintf(): NativePtr

fun snprintf(__s: CValuesRef<ByteVar>?, __maxlen: size_t, __format: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_snprintf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__s, __maxlen, __format), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("cio_kni_snprintf")
private external fun kni_snprintf(): NativePtr

fun dprintf(__fd: Int, __fmt: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_dprintf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__fd, __fmt), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("cio_kni_dprintf")
private external fun kni_dprintf(): NativePtr

fun fscanf(__stream: CValuesRef<FILE>?, __format: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_fscanf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__stream, __format), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("cio_kni_fscanf")
private external fun kni_fscanf(): NativePtr

fun scanf(__format: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_scanf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__format), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("cio_kni_scanf")
private external fun kni_scanf(): NativePtr

fun sscanf(__s: String?, __format: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_sscanf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__s, __format), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("cio_kni_sscanf")
private external fun kni_sscanf(): NativePtr

fun fgetc(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fgetc(___stream)
        res
    }
}

@SymbolName("cio_kni_fgetc")
private external fun kni_fgetc(__stream: NativePtr): Int

fun getc(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_getc(___stream)
        res
    }
}

@SymbolName("cio_kni_getc")
private external fun kni_getc(__stream: NativePtr): Int

fun getchar(): Int {
    val res = kni_getchar()
    return res
}

@SymbolName("cio_kni_getchar")
private external fun kni_getchar(): Int

fun getc_unlocked(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_getc_unlocked(___stream)
        res
    }
}

@SymbolName("cio_kni_getc_unlocked")
private external fun kni_getc_unlocked(__stream: NativePtr): Int

fun getchar_unlocked(): Int {
    val res = kni_getchar_unlocked()
    return res
}

@SymbolName("cio_kni_getchar_unlocked")
private external fun kni_getchar_unlocked(): Int

fun fgetc_unlocked(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fgetc_unlocked(___stream)
        res
    }
}

@SymbolName("cio_kni_fgetc_unlocked")
private external fun kni_fgetc_unlocked(__stream: NativePtr): Int

fun fputc(__c: Int, __stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___c = __c
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fputc(___c, ___stream)
        res
    }
}

@SymbolName("cio_kni_fputc")
private external fun kni_fputc(__c: Int, __stream: NativePtr): Int

fun putc(__c: Int, __stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___c = __c
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_putc(___c, ___stream)
        res
    }
}

@SymbolName("cio_kni_putc")
private external fun kni_putc(__c: Int, __stream: NativePtr): Int

fun putchar(__c: Int): Int {
    val ___c = __c
    val res = kni_putchar(___c)
    return res
}

@SymbolName("cio_kni_putchar")
private external fun kni_putchar(__c: Int): Int

fun fputc_unlocked(__c: Int, __stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___c = __c
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fputc_unlocked(___c, ___stream)
        res
    }
}

@SymbolName("cio_kni_fputc_unlocked")
private external fun kni_fputc_unlocked(__c: Int, __stream: NativePtr): Int

fun putc_unlocked(__c: Int, __stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___c = __c
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_putc_unlocked(___c, ___stream)
        res
    }
}

@SymbolName("cio_kni_putc_unlocked")
private external fun kni_putc_unlocked(__c: Int, __stream: NativePtr): Int

fun putchar_unlocked(__c: Int): Int {
    val ___c = __c
    val res = kni_putchar_unlocked(___c)
    return res
}

@SymbolName("cio_kni_putchar_unlocked")
private external fun kni_putchar_unlocked(__c: Int): Int

fun getw(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_getw(___stream)
        res
    }
}

@SymbolName("cio_kni_getw")
private external fun kni_getw(__stream: NativePtr): Int

fun putw(__w: Int, __stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___w = __w
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_putw(___w, ___stream)
        res
    }
}

@SymbolName("cio_kni_putw")
private external fun kni_putw(__w: Int, __stream: NativePtr): Int

fun fgets(__s: CValuesRef<ByteVar>?, __n: Int, __stream: CValuesRef<FILE>?): CPointer<ByteVar>? {
    return memScoped {
        val ___s = __s?.getPointer(memScope).rawValue
        val ___n = __n
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fgets(___s, ___n, ___stream)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("cio_kni_fgets")
private external fun kni_fgets(__s: NativePtr, __n: Int, __stream: NativePtr): NativePtr

fun __getdelim(__lineptr: CValuesRef<CPointerVar<ByteVar>>?, __n: CValuesRef<size_tVar>?, __delimiter: Int, __stream: CValuesRef<FILE>?): __ssize_t {
    return memScoped {
        val ___lineptr = __lineptr?.getPointer(memScope).rawValue
        val ___n = __n?.getPointer(memScope).rawValue
        val ___delimiter = __delimiter
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni___getdelim(___lineptr, ___n, ___delimiter, ___stream)
        res
    }
}

@SymbolName("cio_kni___getdelim")
private external fun kni___getdelim(__lineptr: NativePtr, __n: NativePtr, __delimiter: Int, __stream: NativePtr): Long

fun getdelim(__lineptr: CValuesRef<CPointerVar<ByteVar>>?, __n: CValuesRef<size_tVar>?, __delimiter: Int, __stream: CValuesRef<FILE>?): __ssize_t {
    return memScoped {
        val ___lineptr = __lineptr?.getPointer(memScope).rawValue
        val ___n = __n?.getPointer(memScope).rawValue
        val ___delimiter = __delimiter
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_getdelim(___lineptr, ___n, ___delimiter, ___stream)
        res
    }
}

@SymbolName("cio_kni_getdelim")
private external fun kni_getdelim(__lineptr: NativePtr, __n: NativePtr, __delimiter: Int, __stream: NativePtr): Long

fun getline(__lineptr: CValuesRef<CPointerVar<ByteVar>>?, __n: CValuesRef<size_tVar>?, __stream: CValuesRef<FILE>?): __ssize_t {
    return memScoped {
        val ___lineptr = __lineptr?.getPointer(memScope).rawValue
        val ___n = __n?.getPointer(memScope).rawValue
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_getline(___lineptr, ___n, ___stream)
        res
    }
}

@SymbolName("cio_kni_getline")
private external fun kni_getline(__lineptr: NativePtr, __n: NativePtr, __stream: NativePtr): Long

fun fputs(__s: String?, __stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___s = __s?.cstr?.getPointer(memScope).rawValue
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fputs(___s, ___stream)
        res
    }
}

@SymbolName("cio_kni_fputs")
private external fun kni_fputs(__s: NativePtr, __stream: NativePtr): Int

fun puts(__s: String?): Int {
    return memScoped {
        val ___s = __s?.cstr?.getPointer(memScope).rawValue
        val res = kni_puts(___s)
        res
    }
}

@SymbolName("cio_kni_puts")
private external fun kni_puts(__s: NativePtr): Int

fun ungetc(__c: Int, __stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___c = __c
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_ungetc(___c, ___stream)
        res
    }
}

@SymbolName("cio_kni_ungetc")
private external fun kni_ungetc(__c: Int, __stream: NativePtr): Int

fun fread(__ptr: COpaquePointer?, __size: size_t, __n: size_t, __stream: CValuesRef<FILE>?): size_t {
    return memScoped {
        val ___ptr = __ptr.rawValue
        val ___size = __size
        val ___n = __n
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fread(___ptr, ___size, ___n, ___stream)
        res
    }
}

@SymbolName("cio_kni_fread")
private external fun kni_fread(__ptr: NativePtr, __size: Long, __n: Long, __stream: NativePtr): Long

fun fwrite(__ptr: COpaquePointer?, __size: size_t, __n: size_t, __s: CValuesRef<FILE>?): size_t {
    return memScoped {
        val ___ptr = __ptr.rawValue
        val ___size = __size
        val ___n = __n
        val ___s = __s?.getPointer(memScope).rawValue
        val res = kni_fwrite(___ptr, ___size, ___n, ___s)
        res
    }
}

@SymbolName("cio_kni_fwrite")
private external fun kni_fwrite(__ptr: NativePtr, __size: Long, __n: Long, __s: NativePtr): Long

fun fread_unlocked(__ptr: COpaquePointer?, __size: size_t, __n: size_t, __stream: CValuesRef<FILE>?): size_t {
    return memScoped {
        val ___ptr = __ptr.rawValue
        val ___size = __size
        val ___n = __n
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fread_unlocked(___ptr, ___size, ___n, ___stream)
        res
    }
}

@SymbolName("cio_kni_fread_unlocked")
private external fun kni_fread_unlocked(__ptr: NativePtr, __size: Long, __n: Long, __stream: NativePtr): Long

fun fwrite_unlocked(__ptr: COpaquePointer?, __size: size_t, __n: size_t, __stream: CValuesRef<FILE>?): size_t {
    return memScoped {
        val ___ptr = __ptr.rawValue
        val ___size = __size
        val ___n = __n
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fwrite_unlocked(___ptr, ___size, ___n, ___stream)
        res
    }
}

@SymbolName("cio_kni_fwrite_unlocked")
private external fun kni_fwrite_unlocked(__ptr: NativePtr, __size: Long, __n: Long, __stream: NativePtr): Long

fun fseek(__stream: CValuesRef<FILE>?, __off: Long, __whence: Int): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val ___off = __off
        val ___whence = __whence
        val res = kni_fseek(___stream, ___off, ___whence)
        res
    }
}

@SymbolName("cio_kni_fseek")
private external fun kni_fseek(__stream: NativePtr, __off: Long, __whence: Int): Int

fun ftell(__stream: CValuesRef<FILE>?): Long {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_ftell(___stream)
        res
    }
}

@SymbolName("cio_kni_ftell")
private external fun kni_ftell(__stream: NativePtr): Long

fun rewind(__stream: CValuesRef<FILE>?): Unit {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_rewind(___stream)
        res
    }
}

@SymbolName("cio_kni_rewind")
private external fun kni_rewind(__stream: NativePtr): Unit

fun fseeko(__stream: CValuesRef<FILE>?, __off: __off_t, __whence: Int): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val ___off = __off
        val ___whence = __whence
        val res = kni_fseeko(___stream, ___off, ___whence)
        res
    }
}

@SymbolName("cio_kni_fseeko")
private external fun kni_fseeko(__stream: NativePtr, __off: Long, __whence: Int): Int

fun ftello(__stream: CValuesRef<FILE>?): __off_t {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_ftello(___stream)
        res
    }
}

@SymbolName("cio_kni_ftello")
private external fun kni_ftello(__stream: NativePtr): Long

fun fgetpos(__stream: CValuesRef<FILE>?, __pos: CValuesRef<fpos_t>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val ___pos = __pos?.getPointer(memScope).rawValue
        val res = kni_fgetpos(___stream, ___pos)
        res
    }
}

@SymbolName("cio_kni_fgetpos")
private external fun kni_fgetpos(__stream: NativePtr, __pos: NativePtr): Int

fun fsetpos(__stream: CValuesRef<FILE>?, __pos: CValuesRef<fpos_t>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val ___pos = __pos?.getPointer(memScope).rawValue
        val res = kni_fsetpos(___stream, ___pos)
        res
    }
}

@SymbolName("cio_kni_fsetpos")
private external fun kni_fsetpos(__stream: NativePtr, __pos: NativePtr): Int

fun clearerr(__stream: CValuesRef<FILE>?): Unit {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_clearerr(___stream)
        res
    }
}

@SymbolName("cio_kni_clearerr")
private external fun kni_clearerr(__stream: NativePtr): Unit

fun feof(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_feof(___stream)
        res
    }
}

@SymbolName("cio_kni_feof")
private external fun kni_feof(__stream: NativePtr): Int

fun ferror(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_ferror(___stream)
        res
    }
}

@SymbolName("cio_kni_ferror")
private external fun kni_ferror(__stream: NativePtr): Int

fun clearerr_unlocked(__stream: CValuesRef<FILE>?): Unit {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_clearerr_unlocked(___stream)
        res
    }
}

@SymbolName("cio_kni_clearerr_unlocked")
private external fun kni_clearerr_unlocked(__stream: NativePtr): Unit

fun feof_unlocked(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_feof_unlocked(___stream)
        res
    }
}

@SymbolName("cio_kni_feof_unlocked")
private external fun kni_feof_unlocked(__stream: NativePtr): Int

fun ferror_unlocked(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_ferror_unlocked(___stream)
        res
    }
}

@SymbolName("cio_kni_ferror_unlocked")
private external fun kni_ferror_unlocked(__stream: NativePtr): Int

fun perror(__s: String?): Unit {
    return memScoped {
        val ___s = __s?.cstr?.getPointer(memScope).rawValue
        val res = kni_perror(___s)
        res
    }
}

@SymbolName("cio_kni_perror")
private external fun kni_perror(__s: NativePtr): Unit

fun fileno(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fileno(___stream)
        res
    }
}

@SymbolName("cio_kni_fileno")
private external fun kni_fileno(__stream: NativePtr): Int

fun fileno_unlocked(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fileno_unlocked(___stream)
        res
    }
}

@SymbolName("cio_kni_fileno_unlocked")
private external fun kni_fileno_unlocked(__stream: NativePtr): Int

fun popen(__command: String?, __modes: String?): CPointer<FILE>? {
    return memScoped {
        val ___command = __command?.cstr?.getPointer(memScope).rawValue
        val ___modes = __modes?.cstr?.getPointer(memScope).rawValue
        val res = kni_popen(___command, ___modes)
        interpretCPointer<FILE>(res)
    }
}

@SymbolName("cio_kni_popen")
private external fun kni_popen(__command: NativePtr, __modes: NativePtr): NativePtr

fun pclose(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_pclose(___stream)
        res
    }
}

@SymbolName("cio_kni_pclose")
private external fun kni_pclose(__stream: NativePtr): Int

fun ctermid(__s: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val ___s = __s?.getPointer(memScope).rawValue
        val res = kni_ctermid(___s)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("cio_kni_ctermid")
private external fun kni_ctermid(__s: NativePtr): NativePtr

fun flockfile(__stream: CValuesRef<FILE>?): Unit {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_flockfile(___stream)
        res
    }
}

@SymbolName("cio_kni_flockfile")
private external fun kni_flockfile(__stream: NativePtr): Unit

fun ftrylockfile(__stream: CValuesRef<FILE>?): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_ftrylockfile(___stream)
        res
    }
}

@SymbolName("cio_kni_ftrylockfile")
private external fun kni_ftrylockfile(__stream: NativePtr): Int

fun funlockfile(__stream: CValuesRef<FILE>?): Unit {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_funlockfile(___stream)
        res
    }
}

@SymbolName("cio_kni_funlockfile")
private external fun kni_funlockfile(__stream: NativePtr): Unit

val _STDIO_H: Int = 1

val _FEATURES_H: Int = 1

val _DEFAULT_SOURCE: Int = 1

val _BSD_SOURCE: Int = 1

val _SVID_SOURCE: Int = 1

val __USE_ISOC11: Int = 1

val __USE_ISOC99: Int = 1

val __USE_ISOC95: Int = 1

val __USE_POSIX_IMPLICITLY: Int = 1

val _POSIX_SOURCE: Int = 1

val _POSIX_C_SOURCE: Long = 200809

val __USE_POSIX: Int = 1

val __USE_POSIX2: Int = 1

val __USE_POSIX199309: Int = 1

val __USE_POSIX199506: Int = 1

val __USE_XOPEN2K: Int = 1

val __USE_XOPEN2K8: Int = 1

val _ATFILE_SOURCE: Int = 1

val __USE_MISC: Int = 1

val __USE_BSD: Int = 1

val __USE_SVID: Int = 1

val __USE_ATFILE: Int = 1

val __USE_FORTIFY_LEVEL: Int = 0

val _STDC_PREDEF_H: Int = 1

val __STDC_IEC_559__: Int = 1

val __STDC_IEC_559_COMPLEX__: Int = 1

val __STDC_ISO_10646__: Long = 201103

val __STDC_NO_THREADS__: Int = 1

val __GNU_LIBRARY__: Int = 6

val __GLIBC__: Int = 2

val __GLIBC_MINOR__: Int = 19

val _SYS_CDEFS_H: Int = 1

val __WORDSIZE: Int = 64

val __WORDSIZE_TIME64_COMPAT32: Int = 1

val __SYSCALL_WORDSIZE: Int = 64

val _BITS_TYPES_H: Int = 1

val _BITS_TYPESIZES_H: Int = 1

val __OFF_T_MATCHES_OFF64_T: Int = 1

val __INO_T_MATCHES_INO64_T: Int = 1

val __FD_SETSIZE: Int = 1024

val __FILE_defined: Int = 1

val ____FILE_defined: Int = 1

val _G_config_h: Int = 1

val ____mbstate_t_defined: Int = 1

val _G_HAVE_MMAP: Int = 1

val _G_HAVE_MREMAP: Int = 1

val _G_IO_IO_FILE_VERSION: Int = 131073

val _G_BUFSIZ: Int = 8192

val _IO_BUFSIZ: Int = 8192

val __GNUC_VA_LIST: Int = 1

val _IO_UNIFIED_JUMPTABLES: Int = 1

val EOF: Int = -1

val _IOS_INPUT: Int = 1

val _IOS_OUTPUT: Int = 2

val _IOS_ATEND: Int = 4

val _IOS_APPEND: Int = 8

val _IOS_TRUNC: Int = 16

val _IOS_NOCREATE: Int = 32

val _IOS_NOREPLACE: Int = 64

val _IOS_BIN: Int = 128

val _IO_MAGIC: Int = -72548352

val _OLD_STDIO_MAGIC: Int = -88342528

val _IO_MAGIC_MASK: Int = -65536

val _IO_USER_BUF: Int = 1

val _IO_UNBUFFERED: Int = 2

val _IO_NO_READS: Int = 4

val _IO_NO_WRITES: Int = 8

val _IO_EOF_SEEN: Int = 16

val _IO_ERR_SEEN: Int = 32

val _IO_DELETE_DONT_CLOSE: Int = 64

val _IO_LINKED: Int = 128

val _IO_IN_BACKUP: Int = 256

val _IO_LINE_BUF: Int = 512

val _IO_TIED_PUT_GET: Int = 1024

val _IO_CURRENTLY_PUTTING: Int = 2048

val _IO_IS_APPENDING: Int = 4096

val _IO_IS_FILEBUF: Int = 8192

val _IO_BAD_SEEN: Int = 16384

val _IO_USER_LOCK: Int = 32768

val _IO_FLAGS2_MMAP: Int = 1

val _IO_FLAGS2_NOTCANCEL: Int = 2

val _IO_FLAGS2_USER_WBUF: Int = 8

val _IO_SKIPWS: Int = 1

val _IO_LEFT: Int = 2

val _IO_RIGHT: Int = 4

val _IO_INTERNAL: Int = 8

val _IO_DEC: Int = 16

val _IO_OCT: Int = 32

val _IO_HEX: Int = 64

val _IO_SHOWBASE: Int = 128

val _IO_SHOWPOINT: Int = 256

val _IO_UPPERCASE: Int = 512

val _IO_SHOWPOS: Int = 1024

val _IO_SCIENTIFIC: Int = 2048

val _IO_FIXED: Int = 4096

val _IO_UNITBUF: Int = 8192

val _IO_STDIO: Int = 16384

val _IO_DONT_CLOSE: Int = 32768

val _IO_BOOLALPHA: Int = 65536

val _IOFBF: Int = 0

val _IOLBF: Int = 1

val _IONBF: Int = 2

val BUFSIZ: Int = 8192

val SEEK_SET: Int = 0

val SEEK_CUR: Int = 1

val SEEK_END: Int = 2

val L_tmpnam: Int = 20

val TMP_MAX: Int = 238328

val FILENAME_MAX: Int = 4096

val L_ctermid: Int = 9

val FOPEN_MAX: Int = 16

class __fsid_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    val __val: CArrayPointer<IntVar>
        get() = arrayMemberAt(0)
    
}

class _IO_FILE(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(216, 8)
    
    var _flags: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var _IO_read_ptr: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var _IO_read_end: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var _IO_read_base: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var _IO_write_base: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(32).value
        set(value) { memberAt<CPointerVar<ByteVar>>(32).value = value }
    
    var _IO_write_ptr: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(40).value
        set(value) { memberAt<CPointerVar<ByteVar>>(40).value = value }
    
    var _IO_write_end: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(48).value
        set(value) { memberAt<CPointerVar<ByteVar>>(48).value = value }
    
    var _IO_buf_base: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(56).value
        set(value) { memberAt<CPointerVar<ByteVar>>(56).value = value }
    
    var _IO_buf_end: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(64).value
        set(value) { memberAt<CPointerVar<ByteVar>>(64).value = value }
    
    var _IO_save_base: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(72).value
        set(value) { memberAt<CPointerVar<ByteVar>>(72).value = value }
    
    var _IO_backup_base: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(80).value
        set(value) { memberAt<CPointerVar<ByteVar>>(80).value = value }
    
    var _IO_save_end: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(88).value
        set(value) { memberAt<CPointerVar<ByteVar>>(88).value = value }
    
    var _markers: CPointer<_IO_marker>?
        get() = memberAt<CPointerVar<_IO_marker>>(96).value
        set(value) { memberAt<CPointerVar<_IO_marker>>(96).value = value }
    
    var _chain: CPointer<_IO_FILE>?
        get() = memberAt<CPointerVar<_IO_FILE>>(104).value
        set(value) { memberAt<CPointerVar<_IO_FILE>>(104).value = value }
    
    var _fileno: Int
        get() = memberAt<IntVar>(112).value
        set(value) { memberAt<IntVar>(112).value = value }
    
    var _flags2: Int
        get() = memberAt<IntVar>(116).value
        set(value) { memberAt<IntVar>(116).value = value }
    
    var _old_offset: __off_t
        get() = memberAt<__off_tVar>(120).value
        set(value) { memberAt<__off_tVar>(120).value = value }
    
    var _cur_column: Short
        get() = memberAt<ShortVar>(128).value
        set(value) { memberAt<ShortVar>(128).value = value }
    
    var _vtable_offset: Byte
        get() = memberAt<ByteVar>(130).value
        set(value) { memberAt<ByteVar>(130).value = value }
    
    val _shortbuf: CArrayPointer<ByteVar>
        get() = arrayMemberAt(131)
    
    var _lock: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(136).value
        set(value) { memberAt<COpaquePointerVar>(136).value = value }
    
    var _offset: __off64_t
        get() = memberAt<__off64_tVar>(144).value
        set(value) { memberAt<__off64_tVar>(144).value = value }
    
    var __pad1: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(152).value
        set(value) { memberAt<COpaquePointerVar>(152).value = value }
    
    var __pad2: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(160).value
        set(value) { memberAt<COpaquePointerVar>(160).value = value }
    
    var __pad3: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(168).value
        set(value) { memberAt<COpaquePointerVar>(168).value = value }
    
    var __pad4: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(176).value
        set(value) { memberAt<COpaquePointerVar>(176).value = value }
    
    var __pad5: size_t
        get() = memberAt<size_tVar>(184).value
        set(value) { memberAt<size_tVar>(184).value = value }
    
    var _mode: Int
        get() = memberAt<IntVar>(192).value
        set(value) { memberAt<IntVar>(192).value = value }
    
    val _unused2: CArrayPointer<ByteVar>
        get() = arrayMemberAt(196)
    
}

class _IO_marker(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 8)
    
    var _next: CPointer<_IO_marker>?
        get() = memberAt<CPointerVar<_IO_marker>>(0).value
        set(value) { memberAt<CPointerVar<_IO_marker>>(0).value = value }
    
    var _sbuf: CPointer<_IO_FILE>?
        get() = memberAt<CPointerVar<_IO_FILE>>(8).value
        set(value) { memberAt<CPointerVar<_IO_FILE>>(8).value = value }
    
    var _pos: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
}

class __mbstate_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var __count: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    val __value: anonymousStruct1
        get() = memberAt(4)
    
}

class anonymousStruct1(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(4, 4)
    
    var __wch: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    val __wchb: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
}

class _G_fpos_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var __pos: __off_t
        get() = memberAt<__off_tVar>(0).value
        set(value) { memberAt<__off_tVar>(0).value = value }
    
    val __state: __mbstate_t
        get() = memberAt(8)
    
}

class _G_fpos64_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var __pos: __off64_t
        get() = memberAt<__off64_tVar>(0).value
        set(value) { memberAt<__off64_tVar>(0).value = value }
    
    val __state: __mbstate_t
        get() = memberAt(8)
    
}

class __va_list_tag(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 8)
    
    var gp_offset: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var fp_offset: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var overflow_arg_area: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var reg_save_area: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
    
}

class __builtin_va_list(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 8)
    
}

enum class __codecvt_result(override val value: Int) : CEnum {
    __codecvt_ok(0),
    __codecvt_partial(1),
    __codecvt_error(2),
    __codecvt_noconv(3),
    ;
    
    companion object {
        fun byValue(value: Int) = __codecvt_result.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: __codecvt_result
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias size_tVar = LongVarOf<size_t>
typealias size_t = Long

typealias __u_charVar = ByteVarOf<__u_char>
typealias __u_char = Byte

typealias __u_shortVar = ShortVarOf<__u_short>
typealias __u_short = Short

typealias __u_intVar = IntVarOf<__u_int>
typealias __u_int = Int

typealias __u_longVar = LongVarOf<__u_long>
typealias __u_long = Long

typealias __int8_tVar = ByteVarOf<__int8_t>
typealias __int8_t = Byte

typealias __uint8_tVar = ByteVarOf<__uint8_t>
typealias __uint8_t = Byte

typealias __int16_tVar = ShortVarOf<__int16_t>
typealias __int16_t = Short

typealias __uint16_tVar = ShortVarOf<__uint16_t>
typealias __uint16_t = Short

typealias __int32_tVar = IntVarOf<__int32_t>
typealias __int32_t = Int

typealias __uint32_tVar = IntVarOf<__uint32_t>
typealias __uint32_t = Int

typealias __int64_tVar = LongVarOf<__int64_t>
typealias __int64_t = Long

typealias __uint64_tVar = LongVarOf<__uint64_t>
typealias __uint64_t = Long

typealias __quad_tVar = LongVarOf<__quad_t>
typealias __quad_t = Long

typealias __u_quad_tVar = LongVarOf<__u_quad_t>
typealias __u_quad_t = Long

typealias __dev_tVar = LongVarOf<__dev_t>
typealias __dev_t = Long

typealias __uid_tVar = IntVarOf<__uid_t>
typealias __uid_t = Int

typealias __gid_tVar = IntVarOf<__gid_t>
typealias __gid_t = Int

typealias __ino_tVar = LongVarOf<__ino_t>
typealias __ino_t = Long

typealias __ino64_tVar = LongVarOf<__ino64_t>
typealias __ino64_t = Long

typealias __mode_tVar = IntVarOf<__mode_t>
typealias __mode_t = Int

typealias __nlink_tVar = LongVarOf<__nlink_t>
typealias __nlink_t = Long

typealias __off_tVar = LongVarOf<__off_t>
typealias __off_t = Long

typealias __off64_tVar = LongVarOf<__off64_t>
typealias __off64_t = Long

typealias __pid_tVar = IntVarOf<__pid_t>
typealias __pid_t = Int

typealias __clock_tVar = LongVarOf<__clock_t>
typealias __clock_t = Long

typealias __rlim_tVar = LongVarOf<__rlim_t>
typealias __rlim_t = Long

typealias __rlim64_tVar = LongVarOf<__rlim64_t>
typealias __rlim64_t = Long

typealias __id_tVar = IntVarOf<__id_t>
typealias __id_t = Int

typealias __time_tVar = LongVarOf<__time_t>
typealias __time_t = Long

typealias __useconds_tVar = IntVarOf<__useconds_t>
typealias __useconds_t = Int

typealias __suseconds_tVar = LongVarOf<__suseconds_t>
typealias __suseconds_t = Long

typealias __daddr_tVar = IntVarOf<__daddr_t>
typealias __daddr_t = Int

typealias __key_tVar = IntVarOf<__key_t>
typealias __key_t = Int

typealias __clockid_tVar = IntVarOf<__clockid_t>
typealias __clockid_t = Int

typealias __timer_tVar = CPointerVarOf<__timer_t>
typealias __timer_t = COpaquePointer

typealias __blksize_tVar = LongVarOf<__blksize_t>
typealias __blksize_t = Long

typealias __blkcnt_tVar = LongVarOf<__blkcnt_t>
typealias __blkcnt_t = Long

typealias __blkcnt64_tVar = LongVarOf<__blkcnt64_t>
typealias __blkcnt64_t = Long

typealias __fsblkcnt_tVar = LongVarOf<__fsblkcnt_t>
typealias __fsblkcnt_t = Long

typealias __fsblkcnt64_tVar = LongVarOf<__fsblkcnt64_t>
typealias __fsblkcnt64_t = Long

typealias __fsfilcnt_tVar = LongVarOf<__fsfilcnt_t>
typealias __fsfilcnt_t = Long

typealias __fsfilcnt64_tVar = LongVarOf<__fsfilcnt64_t>
typealias __fsfilcnt64_t = Long

typealias __fsword_tVar = LongVarOf<__fsword_t>
typealias __fsword_t = Long

typealias __ssize_tVar = LongVarOf<__ssize_t>
typealias __ssize_t = Long

typealias __syscall_slong_tVar = LongVarOf<__syscall_slong_t>
typealias __syscall_slong_t = Long

typealias __syscall_ulong_tVar = LongVarOf<__syscall_ulong_t>
typealias __syscall_ulong_t = Long

typealias __loff_tVar = LongVarOf<__loff_t>
typealias __loff_t = __off64_t

typealias __qaddr_tVar = CPointerVarOf<__qaddr_t>
typealias __qaddr_t = CPointer<__quad_tVar>

typealias __caddr_tVar = CPointerVarOf<__caddr_t>
typealias __caddr_t = CPointer<ByteVar>

typealias __intptr_tVar = LongVarOf<__intptr_t>
typealias __intptr_t = Long

typealias __socklen_tVar = IntVarOf<__socklen_t>
typealias __socklen_t = Int

typealias FILE = _IO_FILE

typealias __FILE = _IO_FILE

typealias __io_read_fn = CFunction<(COpaquePointer?, CPointer<ByteVar>?, size_t) -> __ssize_t>

typealias __io_write_fn = CFunction<(COpaquePointer?, CPointer<ByteVar>?, size_t) -> __ssize_t>

typealias __io_seek_fn = CFunction<(COpaquePointer?, CPointer<__off64_tVar>?, Int) -> Int>

typealias __io_close_fn = CFunction<(COpaquePointer?) -> Int>

typealias off_tVar = LongVarOf<off_t>
typealias off_t = __off_t

typealias ssize_tVar = LongVarOf<ssize_t>
typealias ssize_t = __ssize_t

typealias fpos_t = _G_fpos_t

