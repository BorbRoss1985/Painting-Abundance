package mod;

import net.minecraft.client.renderer.entity.PaintingRenderer;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.Random;

public class Paintings {


    public static DeferredRegister<Motive> FLAGS = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, "painting_abundance");

    public static RegistryObject<Motive> ONE = FLAGS.register("1", () -> new Motive(64, 48));
    public static RegistryObject<Motive> TWO = FLAGS.register("2", () -> new Motive(64, 48));
    public static RegistryObject<Motive> THR = FLAGS.register("3", () -> new Motive(64, 48));
    public static RegistryObject<Motive> FOR = FLAGS.register("4", () -> new Motive(64, 48));
    public static RegistryObject<Motive> FIV = FLAGS.register("5", () -> new Motive(64, 32));
    public static RegistryObject<Motive> SIX = FLAGS.register("6", () -> new Motive(32, 16));
    public static RegistryObject<Motive> SVN = FLAGS.register("7", () -> new Motive(32, 32));
    public static RegistryObject<Motive> EIG = FLAGS.register("8", () -> new Motive(64, 64));
    public static RegistryObject<Motive> NIN = FLAGS.register("9", () -> new Motive(16, 32));
    public static RegistryObject<Motive> TEN = FLAGS.register("10", () -> new Motive(32, 32));
    public static RegistryObject<Motive> ELV = FLAGS.register("11", () -> new Motive(32, 16));
    public static RegistryObject<Motive> TWL = FLAGS.register("12", () -> new Motive(64, 32));
    public static RegistryObject<Motive> THT = FLAGS.register("13", () -> new Motive(64, 64));
    public static RegistryObject<Motive> FRT = FLAGS.register("14", () -> new Motive(64, 32));
    public static RegistryObject<Motive> FFT = FLAGS.register("15", () -> new Motive(64, 32));





    public static void register() {


        FLAGS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }



}
