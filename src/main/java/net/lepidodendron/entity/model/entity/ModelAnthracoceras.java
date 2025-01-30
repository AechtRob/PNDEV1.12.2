package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraAnthracoceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAnthracoceras extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Shell1;
    private final AdvancedModelRenderer Shell2;
    private final AdvancedModelRenderer Shell3;
    private final AdvancedModelRenderer Shell4;
    private final AdvancedModelRenderer Shell5;
    private final AdvancedModelRenderer Shell6;
    private final AdvancedModelRenderer Shell7;
    private final AdvancedModelRenderer Shell8;
    private final AdvancedModelRenderer Shell9;
    private final AdvancedModelRenderer Mantle1;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Mantle2;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle1b;
    private final AdvancedModelRenderer Tentacle1c;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle2b;
    private final AdvancedModelRenderer Tentacle2c;
    private final AdvancedModelRenderer Tentacle3a;
    private final AdvancedModelRenderer Tentacle3b;
    private final AdvancedModelRenderer Tentacle3c;
    private final AdvancedModelRenderer Tentacle4a;
    private final AdvancedModelRenderer Tentacle4b;
    private final AdvancedModelRenderer Tentacle4c;
    private final AdvancedModelRenderer Tentacle5a;
    private final AdvancedModelRenderer Tentacle5b;
    private final AdvancedModelRenderer Tentacle15c;
    private final AdvancedModelRenderer Tentacle6a;
    private final AdvancedModelRenderer Tentacle6b;
    private final AdvancedModelRenderer Tentacle6c;
    private final AdvancedModelRenderer Tentacle7a;
    private final AdvancedModelRenderer Tentacle7b;
    private final AdvancedModelRenderer Tentacle7c;
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle8b;
    private final AdvancedModelRenderer Tentacle8c;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer Tentacle9c;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;
    private final AdvancedModelRenderer Tentacle10c;

    public ModelAnthracoceras() {
        this.textureWidth = 78;
        this.textureHeight = 78;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(Root, 0.48F, 0.0F, 0.0F);


        this.Shell1 = new AdvancedModelRenderer(this);
        this.Shell1.setRotationPoint(0.0F, -7.975F, -8.95F);
        this.Root.addChild(Shell1);
        this.setRotateAngle(Shell1, -0.9163F, 0.0F, 0.0F);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 16, -4.0F, -9.0F, 1.0F, 8, 9, 6, 0.0F, false));

        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, 0.6109F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 0, -3.5F, -9.0F, 0.0F, 7, 9, 7, 0.01F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, 0.829F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 21, 24, -3.5F, -8.0F, 0.0F, 7, 8, 7, 0.0F, false));
        this.Shell3.cubeList.add(new ModelBox(Shell3, 60, 54, -1.5F, -11.0F, 3.0F, 3, 3, 3, 0.0F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, 0.6109F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 24, 39, -3.0F, -8.0F, 0.0F, 6, 8, 6, 0.01F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, 0.6109F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 0, 33, -3.0F, -8.0F, 0.0F, 6, 8, 6, 0.0F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, 0.8727F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 42, 16, -2.5F, -7.0F, 0.0F, 5, 7, 6, 0.01F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, 0.6981F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 44, 34, -2.5F, -6.0F, 0.0F, 5, 6, 5, 0.0F, false));

        this.Shell8 = new AdvancedModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, 0.6981F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 0, 47, -2.0F, -5.0F, 0.0F, 4, 5, 5, 0.01F, false));

        this.Shell9 = new AdvancedModelRenderer(this);
        this.Shell9.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, 0.6981F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 43, 48, -2.0F, -4.0F, 0.0F, 4, 4, 5, 0.0F, false));

        this.Mantle1 = new AdvancedModelRenderer(this);
        this.Mantle1.setRotationPoint(0.0F, -10.625F, -1.65F);
        this.Root.addChild(Mantle1);
        this.setRotateAngle(Mantle1, -0.4363F, 0.0F, 0.0F);
        this.Mantle1.cubeList.add(new ModelBox(Mantle1, 22, 10, -3.5F, -0.8528F, -6.6383F, 7, 6, 6, -0.01F, false));
        this.Mantle1.cubeList.add(new ModelBox(Mantle1, 18, 48, -2.5F, -3.8528F, -6.6383F, 0, 3, 5, 0.0F, false));
        this.Mantle1.cubeList.add(new ModelBox(Mantle1, 13, 42, -1.0F, -3.8528F, -6.6383F, 0, 3, 5, 0.0F, false));
        this.Mantle1.cubeList.add(new ModelBox(Mantle1, 18, 48, 2.5F, -3.8528F, -6.6383F, 0, 3, 5, 0.0F, true));
        this.Mantle1.cubeList.add(new ModelBox(Mantle1, 13, 42, 1.0F, -3.8528F, -6.6383F, 0, 3, 5, 0.0F, true));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.5F, 5.5972F, -4.5133F);
        this.Mantle1.addChild(Siphon);
        this.setRotateAngle(Siphon, 0.3054F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 21, 0, -2.0F, -2.0F, -3.0F, 3, 2, 4, -0.01F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-3.6375F, 1.2472F, -5.6133F);
        this.Mantle1.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.0F, 0.0F, 0.2618F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 26, 65, -0.4625F, -1.5F, -1.5F, 1, 3, 3, -0.01F, false));
        this.rightEye.cubeList.add(new ModelBox(rightEye, 24, 39, -0.5375F, -1.0F, -1.0F, 1, 2, 2, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5625F, -1.5F, 0.0F);
        this.rightEye.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.7418F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 41, 0.1F, -1.875F, -1.5F, 0, 3, 4, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(3.6375F, 1.2472F, -5.6133F);
        this.Mantle1.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.0F, 0.0F, -0.2618F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 26, 65, -0.5375F, -1.5F, -1.5F, 1, 3, 3, -0.01F, true));
        this.leftEye.cubeList.add(new ModelBox(leftEye, 24, 39, -0.4625F, -1.0F, -1.0F, 1, 2, 2, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5625F, -1.5F, 0.0F);
        this.leftEye.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.7418F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 41, -0.1F, -1.875F, -1.5F, 0, 3, 4, 0.0F, true));

        this.Mantle2 = new AdvancedModelRenderer(this);
        this.Mantle2.setRotationPoint(0.0F, -0.8528F, -6.6383F);
        this.Mantle1.addChild(Mantle2);
        this.setRotateAngle(Mantle2, 0.6109F, 0.0F, 0.0F);
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 42, 0, -3.5F, 0.0F, -5.0F, 7, 6, 5, 0.0F, false));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 2, 0, -4.5F, 1.0F, -5.0F, 1, 0, 3, 0.0F, false));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 0, 0, -4.5F, 3.0F, -5.0F, 1, 0, 3, 0.0F, false));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 42, 6, -2.5F, -3.0F, -5.0F, 0, 3, 5, 0.0F, false));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 28, 1, -1.0F, -3.0F, -5.0F, 0, 3, 5, 0.0F, false));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 28, 1, 1.0F, -3.0F, -5.0F, 0, 3, 5, 0.0F, true));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 42, 6, 2.5F, -3.0F, -5.0F, 0, 3, 5, 0.0F, true));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 2, 0, 3.5F, 1.0F, -5.0F, 1, 0, 3, 0.0F, true));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 0, 0, 3.5F, 3.0F, -5.0F, 1, 0, 3, 0.0F, true));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(1.0F, 5.0F, -5.0F);
        this.Mantle2.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, 2.0445F, 0.0803F, -0.1551F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 59, 29, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, 0.4851F, -0.4891F, -0.195F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 67, 15, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle1c = new AdvancedModelRenderer(this);
        this.Tentacle1c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle1b.addChild(Tentacle1c);
        this.setRotateAngle(Tentacle1c, 0.2618F, -0.2618F, 0.0F);
        this.Tentacle1c.cubeList.add(new ModelBox(Tentacle1c, 7, 67, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(2.5F, 5.0F, -5.0F);
        this.Mantle2.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, 1.8371F, 0.192F, -0.8117F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 22, 59, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.setRotateAngle(Tentacle2b, 0.4051F, -0.2415F, -0.1022F);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 66, 10, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle2c = new AdvancedModelRenderer(this);
        this.Tentacle2c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle2b.addChild(Tentacle2c);
        this.setRotateAngle(Tentacle2c, 0.3491F, -0.4363F, 0.0F);
        this.Tentacle2c.cubeList.add(new ModelBox(Tentacle2c, 66, 5, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(2.5F, 3.0F, -5.0F);
        this.Mantle2.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, 0.6441F, -0.8287F, -0.2838F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 58, 11, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, -0.2618F, -0.5236F, 0.0F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 58, 65, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle3c = new AdvancedModelRenderer(this);
        this.Tentacle3c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle3b.addChild(Tentacle3c);
        this.setRotateAngle(Tentacle3c, -0.3124F, -0.2079F, 0.0666F);
        this.Tentacle3c.cubeList.add(new ModelBox(Tentacle3c, 65, 48, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(2.5F, 1.0F, -5.0F);
        this.Mantle2.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, -0.0579F, -0.683F, 0.6792F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 52, 57, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 0, 27, 0.0F, -3.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, -0.1107F, 0.3736F, -0.1239F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 16, 65, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 0, 2, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Tentacle4c = new AdvancedModelRenderer(this);
        this.Tentacle4c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle4b.addChild(Tentacle4c);
        this.setRotateAngle(Tentacle4c, -0.588F, 0.4478F, -0.281F);
        this.Tentacle4c.cubeList.add(new ModelBox(Tentacle4c, 64, 40, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle4c.cubeList.add(new ModelBox(Tentacle4c, 0, 0, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(1.0F, 1.0F, -5.0F);
        this.Mantle2.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, 0.3646F, -0.2865F, -0.1074F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 40, 57, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 28, 18, 0.0F, -3.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.setRotateAngle(Tentacle5b, -0.4363F, 0.3491F, 0.0F);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 64, 35, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 0, 30, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Tentacle15c = new AdvancedModelRenderer(this);
        this.Tentacle15c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle5b.addChild(Tentacle15c);
        this.setRotateAngle(Tentacle15c, -0.4498F, 0.2368F, -0.1128F);
        this.Tentacle15c.cubeList.add(new ModelBox(Tentacle15c, 64, 22, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle15c.cubeList.add(new ModelBox(Tentacle15c, 0, 17, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(-1.0F, 5.0F, -5.0F);
        this.Mantle2.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, 2.0445F, -0.0803F, 0.1551F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 0, 57, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, 0.4851F, 0.4891F, 0.195F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 0, 64, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle6c = new AdvancedModelRenderer(this);
        this.Tentacle6c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle6b.addChild(Tentacle6c);
        this.setRotateAngle(Tentacle6c, 0.2618F, 0.2618F, 0.0F);
        this.Tentacle6c.cubeList.add(new ModelBox(Tentacle6c, 51, 63, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(-2.5F, 5.0F, -5.0F);
        this.Mantle2.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, 1.8371F, -0.192F, 0.8117F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 56, 45, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.setRotateAngle(Tentacle7b, 0.4051F, 0.2415F, 0.1022F);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 41, 63, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle7c = new AdvancedModelRenderer(this);
        this.Tentacle7c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle7b.addChild(Tentacle7c);
        this.setRotateAngle(Tentacle7c, 0.3491F, 0.4363F, 0.0F);
        this.Tentacle7c.cubeList.add(new ModelBox(Tentacle7c, 31, 62, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(-2.5F, 3.0F, -5.0F);
        this.Mantle2.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, 0.6441F, 0.8287F, 0.2838F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 14, 56, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, -0.2618F, 0.5236F, 0.0F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 9, 62, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle8c = new AdvancedModelRenderer(this);
        this.Tentacle8c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle8b.addChild(Tentacle8c);
        this.setRotateAngle(Tentacle8c, -0.3124F, 0.2079F, -0.0666F);
        this.Tentacle8c.cubeList.add(new ModelBox(Tentacle8c, 61, 60, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(-2.5F, 1.0F, -5.0F);
        this.Mantle2.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, -0.0579F, 0.683F, -0.6792F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 32, 55, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 8, 27, 0.0F, -3.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, -0.1107F, -0.3736F, 0.1239F);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 61, 0, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 0, 15, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Tentacle9c = new AdvancedModelRenderer(this);
        this.Tentacle9c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle9b.addChild(Tentacle9c);
        this.setRotateAngle(Tentacle9c, -0.588F, -0.4478F, 0.281F);
        this.Tentacle9c.cubeList.add(new ModelBox(Tentacle9c, 58, 17, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle9c.cubeList.add(new ModelBox(Tentacle9c, 0, 13, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(-1.0F, 1.0F, -5.0F);
        this.Mantle2.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, 0.3646F, 0.2865F, 0.1074F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 24, 53, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 42, 10, 0.0F, -3.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, -0.4363F, -0.3491F, 0.0F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 49, 29, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 0, 34, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Tentacle10c = new AdvancedModelRenderer(this);
        this.Tentacle10c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle10b.addChild(Tentacle10c);
        this.setRotateAngle(Tentacle10c, -0.4498F, -0.2368F, 0.1128F);
        this.Tentacle10c.cubeList.add(new ModelBox(Tentacle10c, 35, 0, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle10c.cubeList.add(new ModelBox(Tentacle10c, 0, 32, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Root.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.Root.offsetY = 0.18F;
        this.Root.offsetZ = 0.1F;
        this.Root.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = -2.0F;
        this.Root.offsetX = -1.338F;
        this.Root.rotateAngleY = (float)Math.toRadians(200);
        this.Root.rotateAngleX = (float)Math.toRadians(8);
        this.Root.rotateAngleZ = (float)Math.toRadians(-8);
        this.Root.scaleChildren = true;
        float scaler = 1.63F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
//        this.resetToDefaultPose();
        this.Root.offsetZ = 0.42F;

//        boolean isAtBottom = false;
//        if (e.getPosition().getY() - 1 > 1) {
//            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
//            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
//                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
//                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
//        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAnthracoceras ee = (EntityPrehistoricFloraAnthracoceras) entitylivingbaseIn;
        //Swimming pose:
        

        if (ee.getIsMoving() ) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnthracoceras entity = (EntityPrehistoricFloraAnthracoceras) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-20))*0.5), Root.rotateAngleY + (float) Math.toRadians(0), Root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-0.5));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0.7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*0.1);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+40))*0.2);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -1.70836 + (((tickAnim - 0) / 13) * (-11.21936-(-1.70836)));
            yy = 6.226 + (((tickAnim - 0) / 13) * (19.50147-(6.226)));
            zz = -13.6609 + (((tickAnim - 0) / 13) * (-28.85638-(-13.6609)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -11.21936 + (((tickAnim - 13) / 17) * (-1.70836-(-11.21936)));
            yy = 19.50147 + (((tickAnim - 13) / 17) * (6.226-(19.50147)));
            zz = -28.85638 + (((tickAnim - 13) / 17) * (-13.6609-(-28.85638)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(xx), Tentacle1a.rotateAngleY + (float) Math.toRadians(yy), Tentacle1a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -11.96313 + (((tickAnim - 0) / 3) * (16.17119-(-11.96313)));
            yy = 21.47172 + (((tickAnim - 0) / 3) * (16.90699-(21.47172)));
            zz = 11.11183 + (((tickAnim - 0) / 3) * (9.77145-(11.11183)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 16.17119 + (((tickAnim - 3) / 5) * (31.23835-(16.17119)));
            yy = 16.90699 + (((tickAnim - 3) / 5) * (14.62463-(16.90699)));
            zz = 9.77145 + (((tickAnim - 3) / 5) * (9.10126-(9.77145)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 31.23835 + (((tickAnim - 8) / 5) * (13.1048-(31.23835)));
            yy = 14.62463 + (((tickAnim - 8) / 5) * (-15.89892-(14.62463)));
            zz = 9.10126 + (((tickAnim - 8) / 5) * (20.36121-(9.10126)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 13.1048 + (((tickAnim - 13) / 4) * (-32.42266-(13.1048)));
            yy = -15.89892 + (((tickAnim - 13) / 4) * (-8.03142-(-15.89892)));
            zz = 20.36121 + (((tickAnim - 13) / 4) * (18.41397-(20.36121)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -32.42266 + (((tickAnim - 17) / 3) * (-13.64606-(-32.42266)));
            yy = -8.03142 + (((tickAnim - 17) / 3) * (3.37589-(-8.03142)));
            zz = 18.41397 + (((tickAnim - 17) / 3) * (-12.93157-(18.41397)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13.64606 + (((tickAnim - 20) / 10) * (-11.96313-(-13.64606)));
            yy = 3.37589 + (((tickAnim - 20) / 10) * (21.47172-(3.37589)));
            zz = -12.93157 + (((tickAnim - 20) / 10) * (11.11183-(-12.93157)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(xx), Tentacle1b.rotateAngleY + (float) Math.toRadians(yy), Tentacle1b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15 + (((tickAnim - 0) / 3) * (-49.375-(-15)));
            yy = 26.75 + (((tickAnim - 0) / 3) * (9.125-(26.75)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -49.375 + (((tickAnim - 3) / 5) * (-14.8125-(-49.375)));
            yy = 9.125 + (((tickAnim - 3) / 5) * (0.3125-(9.125)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -14.8125 + (((tickAnim - 8) / 3) * (13.125-(-14.8125)));
            yy = 0.3125 + (((tickAnim - 8) / 3) * (-4.975-(0.3125)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 13.125 + (((tickAnim - 11) / 2) * (-43.25-(13.125)));
            yy = -4.975 + (((tickAnim - 11) / 2) * (-8.5-(-4.975)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -43.25 + (((tickAnim - 13) / 4) * (51.19737-(-43.25)));
            yy = -8.5 + (((tickAnim - 13) / 4) * (-1.07895-(-8.5)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 51.19737 + (((tickAnim - 17) / 3) * (0-(51.19737)));
            yy = -1.07895 + (((tickAnim - 17) / 3) * (0-(-1.07895)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-15-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (26.75-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle1c, Tentacle1c.rotateAngleX + (float) Math.toRadians(xx), Tentacle1c.rotateAngleY + (float) Math.toRadians(yy), Tentacle1c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -29.103 + (((tickAnim - 0) / 8) * (-16.32984-(-29.103)));
            yy = 43.94685 + (((tickAnim - 0) / 8) * (33.02338-(43.94685)));
            zz = -22.39382 + (((tickAnim - 0) / 8) * (2.12004-(-22.39382)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -16.32984 + (((tickAnim - 8) / 8) * (-5.37225-(-16.32984)));
            yy = 33.02338 + (((tickAnim - 8) / 8) * (39.10308-(33.02338)));
            zz = 2.12004 + (((tickAnim - 8) / 8) * (-26.62519-(2.12004)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -5.37225 + (((tickAnim - 16) / 6) * (-48.28124-(-5.37225)));
            yy = 39.10308 + (((tickAnim - 16) / 6) * (37.00492-(39.10308)));
            zz = -26.62519 + (((tickAnim - 16) / 6) * (-45.38723-(-26.62519)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -48.28124 + (((tickAnim - 22) / 8) * (-29.103-(-48.28124)));
            yy = 37.00492 + (((tickAnim - 22) / 8) * (43.94685-(37.00492)));
            zz = -45.38723 + (((tickAnim - 22) / 8) * (-22.39382-(-45.38723)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(xx), Tentacle2a.rotateAngleY + (float) Math.toRadians(yy), Tentacle2a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -7.81329 + (((tickAnim - 0) / 8) * (-7.46193-(-7.81329)));
            yy = 17.75589 + (((tickAnim - 0) / 8) * (26.4268-(17.75589)));
            zz = 12.31543 + (((tickAnim - 0) / 8) * (14.75465-(12.31543)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -7.46193 + (((tickAnim - 8) / 3) * (-27.40501-(-7.46193)));
            yy = 26.4268 + (((tickAnim - 8) / 3) * (41.12738-(26.4268)));
            zz = 14.75465 + (((tickAnim - 8) / 3) * (13.46633-(14.75465)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -27.40501 + (((tickAnim - 11) / 5) * (-24.08613-(-27.40501)));
            yy = 41.12738 + (((tickAnim - 11) / 5) * (30.37873-(41.12738)));
            zz = 13.46633 + (((tickAnim - 11) / 5) * (13.65003-(13.46633)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -24.08613 + (((tickAnim - 16) / 2) * (-4.13551-(-24.08613)));
            yy = 30.37873 + (((tickAnim - 16) / 2) * (21.62958-(30.37873)));
            zz = 13.65003 + (((tickAnim - 16) / 2) * (5.8529-(13.65003)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -4.13551 + (((tickAnim - 18) / 4) * (0-(-4.13551)));
            yy = 21.62958 + (((tickAnim - 18) / 4) * (7.75-(21.62958)));
            zz = 5.8529 + (((tickAnim - 18) / 4) * (0-(5.8529)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-7.81329-(0)));
            yy = 7.75 + (((tickAnim - 22) / 8) * (17.75589-(7.75)));
            zz = 0 + (((tickAnim - 22) / 8) * (12.31543-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(xx), Tentacle2b.rotateAngleY + (float) Math.toRadians(yy), Tentacle2b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -10.42072 + (((tickAnim - 0) / 8) * (-10.02054-(-10.42072)));
            yy = 32.02902 + (((tickAnim - 0) / 8) * (42.62377-(32.02902)));
            zz = 5.66181 + (((tickAnim - 0) / 8) * (7.52818-(5.66181)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -10.02054 + (((tickAnim - 8) / 3) * (-18.27054-(-10.02054)));
            yy = 42.62377 + (((tickAnim - 8) / 3) * (42.62377-(42.62377)));
            zz = 7.52818 + (((tickAnim - 8) / 3) * (7.52818-(7.52818)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -18.27054 + (((tickAnim - 11) / 5) * (-40.52054-(-18.27054)));
            yy = 42.62377 + (((tickAnim - 11) / 5) * (42.62377-(42.62377)));
            zz = 7.52818 + (((tickAnim - 11) / 5) * (7.52818-(7.52818)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -40.52054 + (((tickAnim - 16) / 2) * (3.60505-(-40.52054)));
            yy = 42.62377 + (((tickAnim - 16) / 2) * (29.89496-(42.62377)));
            zz = 7.52818 + (((tickAnim - 16) / 2) * (4.94135-(7.52818)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 3.60505 + (((tickAnim - 18) / 4) * (-13.9775-(3.60505)));
            yy = 29.89496 + (((tickAnim - 18) / 4) * (12.92322-(29.89496)));
            zz = 4.94135 + (((tickAnim - 18) / 4) * (1.49224-(4.94135)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -13.9775 + (((tickAnim - 22) / 8) * (-10.42072-(-13.9775)));
            yy = 12.92322 + (((tickAnim - 22) / 8) * (32.02902-(12.92322)));
            zz = 1.49224 + (((tickAnim - 22) / 8) * (5.66181-(1.49224)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2c, Tentacle2c.rotateAngleX + (float) Math.toRadians(xx), Tentacle2c.rotateAngleY + (float) Math.toRadians(yy), Tentacle2c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 17.3142 + (((tickAnim - 0) / 6) * (9.79348-(17.3142)));
            yy = 76.51945 + (((tickAnim - 0) / 6) * (60.41693-(76.51945)));
            zz = 0.07764 + (((tickAnim - 0) / 6) * (-20.51777-(0.07764)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 9.79348 + (((tickAnim - 6) / 6) * (9.47343-(9.79348)));
            yy = 60.41693 + (((tickAnim - 6) / 6) * (35.94125-(60.41693)));
            zz = -20.51777 + (((tickAnim - 6) / 6) * (-45.73223-(-20.51777)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 9.47343 + (((tickAnim - 12) / 8) * (14.28849-(9.47343)));
            yy = 35.94125 + (((tickAnim - 12) / 8) * (23.01051-(35.94125)));
            zz = -45.73223 + (((tickAnim - 12) / 8) * (-61.12751-(-45.73223)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 14.28849 + (((tickAnim - 20) / 10) * (17.3142-(14.28849)));
            yy = 23.01051 + (((tickAnim - 20) / 10) * (76.51945-(23.01051)));
            zz = -61.12751 + (((tickAnim - 20) / 10) * (0.07764-(-61.12751)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(xx), Tentacle3a.rotateAngleY + (float) Math.toRadians(yy), Tentacle3a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15.29514 + (((tickAnim - 0) / 6) * (15.05037-(15.29514)));
            yy = -51.50065 + (((tickAnim - 0) / 6) * (59.99923-(-51.50065)));
            zz = 1.70763 + (((tickAnim - 0) / 6) * (2.02471-(1.70763)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 15.05037 + (((tickAnim - 6) / 6) * (15.04362-(15.05037)));
            yy = 59.99923 + (((tickAnim - 6) / 6) * (29.24924-(59.99923)));
            zz = 2.02471 + (((tickAnim - 6) / 6) * (1.99895-(2.02471)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 15.04362 + (((tickAnim - 12) / 8) * (15.0458-(15.04362)));
            yy = 29.24924 + (((tickAnim - 12) / 8) * (12.24924-(29.24924)));
            zz = 1.99895 + (((tickAnim - 12) / 8) * (1.98556-(1.99895)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 15.0458 + (((tickAnim - 20) / 6) * (15.26562-(15.0458)));
            yy = 12.24924 + (((tickAnim - 20) / 6) * (-35.41727-(12.24924)));
            zz = 1.98556 + (((tickAnim - 20) / 6) * (1.73714-(1.98556)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 15.26562 + (((tickAnim - 26) / 4) * (15.29514-(15.26562)));
            yy = -35.41727 + (((tickAnim - 26) / 4) * (-51.50065-(-35.41727)));
            zz = 1.73714 + (((tickAnim - 26) / 4) * (1.70763-(1.73714)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(xx), Tentacle3b.rotateAngleY + (float) Math.toRadians(yy), Tentacle3b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1.325-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 30) {
            xx = 0.05 + (((tickAnim - 6) / 24) * (0-(0.05)));
            yy = 0 + (((tickAnim - 6) / 24) * (0-(0)));
            zz = 1.325 + (((tickAnim - 6) / 24) * (0-(1.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tentacle3b.rotationPointX = this.Tentacle3b.rotationPointX + (float)(xx);
        this.Tentacle3b.rotationPointY = this.Tentacle3b.rotationPointY - (float)(yy);
        this.Tentacle3b.rotationPointZ = this.Tentacle3b.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0.75 + (((tickAnim - 0) / 16) * (57.62482-(0.75)));
            yy = 11.75 + (((tickAnim - 0) / 16) * (5.75004-(11.75)));
            zz = 0 + (((tickAnim - 0) / 16) * (-18.22643-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 57.62482 + (((tickAnim - 16) / 5) * (15.76895-(57.62482)));
            yy = 5.75004 + (((tickAnim - 16) / 5) * (10.27094-(5.75004)));
            zz = -18.22643 + (((tickAnim - 16) / 5) * (-21.8875-(-18.22643)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 15.76895 + (((tickAnim - 21) / 5) * (-4.73105-(15.76895)));
            yy = 10.27094 + (((tickAnim - 21) / 5) * (10.27094-(10.27094)));
            zz = -21.8875 + (((tickAnim - 21) / 5) * (-14.7625-(-21.8875)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -4.73105 + (((tickAnim - 26) / 4) * (0.75-(-4.73105)));
            yy = 10.27094 + (((tickAnim - 26) / 4) * (11.75-(10.27094)));
            zz = -14.7625 + (((tickAnim - 26) / 4) * (0-(-14.7625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(xx), Tentacle4a.rotateAngleY + (float) Math.toRadians(yy), Tentacle4a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 21.64274 + (((tickAnim - 0) / 16) * (31.19344-(21.64274)));
            yy = -10.5858 + (((tickAnim - 0) / 16) * (-24.18618-(-10.5858)));
            zz = -3.97118 + (((tickAnim - 0) / 16) * (-10.32888-(-3.97118)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 31.19344 + (((tickAnim - 16) / 5) * (31.94344-(31.19344)));
            yy = -24.18618 + (((tickAnim - 16) / 5) * (-24.18618-(-24.18618)));
            zz = -10.32888 + (((tickAnim - 16) / 5) * (-10.32888-(-10.32888)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 31.94344 + (((tickAnim - 21) / 5) * (8.44344-(31.94344)));
            yy = -24.18618 + (((tickAnim - 21) / 5) * (-24.18618-(-24.18618)));
            zz = -10.32888 + (((tickAnim - 21) / 5) * (-10.32888-(-10.32888)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 8.44344 + (((tickAnim - 26) / 4) * (21.64274-(8.44344)));
            yy = -24.18618 + (((tickAnim - 26) / 4) * (-10.5858-(-24.18618)));
            zz = -10.32888 + (((tickAnim - 26) / 4) * (-3.97118-(-10.32888)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(xx), Tentacle4b.rotateAngleY + (float) Math.toRadians(yy), Tentacle4b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -12.627 + (((tickAnim - 0) / 16) * (-82.41218-(-12.627)));
            yy = -18.30395 + (((tickAnim - 0) / 16) * (-25.90777-(-18.30395)));
            zz = -10.99744 + (((tickAnim - 0) / 16) * (14.2217-(-10.99744)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -82.41218 + (((tickAnim - 16) / 5) * (117.33782-(-82.41218)));
            yy = -25.90777 + (((tickAnim - 16) / 5) * (-25.90777-(-25.90777)));
            zz = 14.2217 + (((tickAnim - 16) / 5) * (14.2217-(14.2217)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 117.33782 + (((tickAnim - 21) / 5) * (32.58782-(117.33782)));
            yy = -25.90777 + (((tickAnim - 21) / 5) * (-25.90777-(-25.90777)));
            zz = 14.2217 + (((tickAnim - 21) / 5) * (14.2217-(14.2217)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 32.58782 + (((tickAnim - 26) / 4) * (-12.627-(32.58782)));
            yy = -25.90777 + (((tickAnim - 26) / 4) * (-18.30395-(-25.90777)));
            zz = 14.2217 + (((tickAnim - 26) / 4) * (-10.99744-(14.2217)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle4c, Tentacle4c.rotateAngleX + (float) Math.toRadians(xx), Tentacle4c.rotateAngleY + (float) Math.toRadians(yy), Tentacle4c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 46.5 + (((tickAnim - 0) / 3) * (10.21547-(46.5)));
            yy = 8.5 + (((tickAnim - 0) / 3) * (12.69529-(8.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (2.2244-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 10.21547 + (((tickAnim - 3) / 5) * (-14.78453-(10.21547)));
            yy = 12.69529 + (((tickAnim - 3) / 5) * (12.69529-(12.69529)));
            zz = 2.2244 + (((tickAnim - 3) / 5) * (2.2244-(2.2244)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -14.78453 + (((tickAnim - 8) / 5) * (-6.28453-(-14.78453)));
            yy = 12.69529 + (((tickAnim - 8) / 5) * (12.69529-(12.69529)));
            zz = 2.2244 + (((tickAnim - 8) / 5) * (2.2244-(2.2244)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -6.28453 + (((tickAnim - 13) / 5) * (16.71547-(-6.28453)));
            yy = 12.69529 + (((tickAnim - 13) / 5) * (12.69529-(12.69529)));
            zz = 2.2244 + (((tickAnim - 13) / 5) * (2.2244-(2.2244)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 16.71547 + (((tickAnim - 18) / 12) * (46.5-(16.71547)));
            yy = 12.69529 + (((tickAnim - 18) / 12) * (8.5-(12.69529)));
            zz = 2.2244 + (((tickAnim - 18) / 12) * (0-(2.2244)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(xx), Tentacle5a.rotateAngleY + (float) Math.toRadians(yy), Tentacle5a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0.825 + (((tickAnim - 0) / 30) * (0.825-(0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tentacle5a.rotationPointX = this.Tentacle5a.rotationPointX + (float)(xx);
        this.Tentacle5a.rotationPointY = this.Tentacle5a.rotationPointY - (float)(yy);
        this.Tentacle5a.rotationPointZ = this.Tentacle5a.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.75 + (((tickAnim - 0) / 3) * (36.96639-(8.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (-8.79655-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.97804-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 36.96639 + (((tickAnim - 3) / 5) * (13.99642-(36.96639)));
            yy = -8.79655 + (((tickAnim - 3) / 5) * (-22.50076-(-8.79655)));
            zz = -1.97804 + (((tickAnim - 3) / 5) * (-4.85592-(-1.97804)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 13.99642 + (((tickAnim - 8) / 5) * (-4.25358-(13.99642)));
            yy = -22.50076 + (((tickAnim - 8) / 5) * (-22.50076-(-22.50076)));
            zz = -4.85592 + (((tickAnim - 8) / 5) * (-4.85592-(-4.85592)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -4.25358 + (((tickAnim - 13) / 17) * (8.75-(-4.25358)));
            yy = -22.50076 + (((tickAnim - 13) / 17) * (0-(-22.50076)));
            zz = -4.85592 + (((tickAnim - 13) / 17) * (0-(-4.85592)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle5b, Tentacle5b.rotateAngleX + (float) Math.toRadians(xx), Tentacle5b.rotateAngleY + (float) Math.toRadians(yy), Tentacle5b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -33.9355 + (((tickAnim - 0) / 3) * (59.8145-(-33.9355)));
            yy = -11.18368 + (((tickAnim - 0) / 3) * (-11.18368-(-11.18368)));
            zz = -6.7037 + (((tickAnim - 0) / 3) * (-6.7037-(-6.7037)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 59.8145 + (((tickAnim - 3) / 5) * (108.0645-(59.8145)));
            yy = -11.18368 + (((tickAnim - 3) / 5) * (-11.18368-(-11.18368)));
            zz = -6.7037 + (((tickAnim - 3) / 5) * (-6.7037-(-6.7037)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 108.0645 + (((tickAnim - 8) / 5) * (15.0645-(108.0645)));
            yy = -11.18368 + (((tickAnim - 8) / 5) * (-11.18368-(-11.18368)));
            zz = -6.7037 + (((tickAnim - 8) / 5) * (-6.7037-(-6.7037)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 15.0645 + (((tickAnim - 13) / 5) * (-9.4355-(15.0645)));
            yy = -11.18368 + (((tickAnim - 13) / 5) * (-11.18368-(-11.18368)));
            zz = -6.7037 + (((tickAnim - 13) / 5) * (-6.7037-(-6.7037)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -9.4355 + (((tickAnim - 18) / 12) * (-33.9355-(-9.4355)));
            yy = -11.18368 + (((tickAnim - 18) / 12) * (-11.18368-(-11.18368)));
            zz = -6.7037 + (((tickAnim - 18) / 12) * (-6.7037-(-6.7037)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle15c, Tentacle15c.rotateAngleX + (float) Math.toRadians(xx), Tentacle15c.rotateAngleY + (float) Math.toRadians(yy), Tentacle15c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -1.70836 + (((tickAnim - 0) / 11) * (-9.29247-(-1.70836)));
            yy = -6.22599 + (((tickAnim - 0) / 11) * (-23.76037-(-6.22599)));
            zz = 13.66092 + (((tickAnim - 0) / 11) * (22.09903-(13.66092)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = -9.29247 + (((tickAnim - 11) / 19) * (-1.70836-(-9.29247)));
            yy = -23.76037 + (((tickAnim - 11) / 19) * (-6.22599-(-23.76037)));
            zz = 22.09903 + (((tickAnim - 11) / 19) * (13.66092-(22.09903)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(xx), Tentacle6a.rotateAngleY + (float) Math.toRadians(yy), Tentacle6a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -6.27328 + (((tickAnim - 0) / 4) * (19.49181-(-6.27328)));
            yy = -12.01687 + (((tickAnim - 0) / 4) * (-5.90468-(-12.01687)));
            zz = -5.36437 + (((tickAnim - 0) / 4) * (2.41669-(-5.36437)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 19.49181 + (((tickAnim - 4) / 3) * (35.74249-(19.49181)));
            yy = -5.90468 + (((tickAnim - 4) / 3) * (-0.77043-(-5.90468)));
            zz = 2.41669 + (((tickAnim - 4) / 3) * (8.95278-(2.41669)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 35.74249 + (((tickAnim - 7) / 1) * (25.74294-(35.74249)));
            yy = -0.77043 + (((tickAnim - 7) / 1) * (2.6524-(-0.77043)));
            zz = 8.95278 + (((tickAnim - 7) / 1) * (13.31017-(8.95278)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 25.74294 + (((tickAnim - 8) / 3) * (21.30912-(25.74294)));
            yy = 2.6524 + (((tickAnim - 8) / 3) * (-4.24002-(2.6524)));
            zz = 13.31017 + (((tickAnim - 8) / 3) * (3.65588-(13.31017)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 21.30912 + (((tickAnim - 11) / 5) * (-4.49033-(21.30912)));
            yy = -4.24002 + (((tickAnim - 11) / 5) * (0.36887-(-4.24002)));
            zz = 3.65588 + (((tickAnim - 11) / 5) * (5.81542-(3.65588)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -4.49033 + (((tickAnim - 16) / 14) * (-6.27328-(-4.49033)));
            yy = 0.36887 + (((tickAnim - 16) / 14) * (-12.01687-(0.36887)));
            zz = 5.81542 + (((tickAnim - 16) / 14) * (-5.36437-(5.81542)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(xx), Tentacle6b.rotateAngleY + (float) Math.toRadians(yy), Tentacle6b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -10 + (((tickAnim - 0) / 2) * (-49.37419-(-10)));
            yy = -28.75 + (((tickAnim - 0) / 2) * (-21.54411-(-28.75)));
            zz = 0 + (((tickAnim - 0) / 2) * (-2.11893-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -49.37419 + (((tickAnim - 2) / 3) * (-28.18547-(-49.37419)));
            yy = -21.54411 + (((tickAnim - 2) / 3) * (-10.73529-(-21.54411)));
            zz = -2.11893 + (((tickAnim - 2) / 3) * (-5.29733-(-2.11893)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -28.18547 + (((tickAnim - 5) / 3) * (-37.06956-(-28.18547)));
            yy = -10.73529 + (((tickAnim - 5) / 3) * (3.67649-(-10.73529)));
            zz = -5.29733 + (((tickAnim - 5) / 3) * (-9.53519-(-5.29733)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -37.06956 + (((tickAnim - 8) / 3) * (-34.29513-(-37.06956)));
            yy = 3.67649 + (((tickAnim - 8) / 3) * (14.48531-(3.67649)));
            zz = -9.53519 + (((tickAnim - 8) / 3) * (-12.71359-(-9.53519)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -34.29513 + (((tickAnim - 11) / 5) * (4.53718-(-34.29513)));
            yy = 14.48531 + (((tickAnim - 11) / 5) * (38.30573-(14.48531)));
            zz = -12.71359 + (((tickAnim - 11) / 5) * (-46.25466-(-12.71359)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 4.53718 + (((tickAnim - 16) / 2) * (0-(4.53718)));
            yy = 38.30573 + (((tickAnim - 16) / 2) * (0-(38.30573)));
            zz = -46.25466 + (((tickAnim - 16) / 2) * (0-(-46.25466)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-17.72287-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-4.67343-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (9.12325-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -17.72287 + (((tickAnim - 20) / 10) * (-10-(-17.72287)));
            yy = -4.67343 + (((tickAnim - 20) / 10) * (-28.75-(-4.67343)));
            zz = 9.12325 + (((tickAnim - 20) / 10) * (0-(9.12325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle6c, Tentacle6c.rotateAngleX + (float) Math.toRadians(xx), Tentacle6c.rotateAngleY + (float) Math.toRadians(yy), Tentacle6c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -15.79881 + (((tickAnim - 0) / 8) * (-4.85882-(-15.79881)));
            yy = -26.57546 + (((tickAnim - 0) / 8) * (-25.31648-(-26.57546)));
            zz = 4.68243 + (((tickAnim - 0) / 8) * (-13.42066-(4.68243)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -4.85882 + (((tickAnim - 8) / 3) * (-5.63855-(-4.85882)));
            yy = -25.31648 + (((tickAnim - 8) / 3) * (-27.61842-(-25.31648)));
            zz = -13.42066 + (((tickAnim - 8) / 3) * (-0.92106-(-13.42066)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -5.63855 + (((tickAnim - 11) / 5) * (10.93887-(-5.63855)));
            yy = -27.61842 + (((tickAnim - 11) / 5) * (-29.92036-(-27.61842)));
            zz = -0.92106 + (((tickAnim - 11) / 5) * (11.57854-(-0.92106)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 10.93887 + (((tickAnim - 16) / 6) * (-29.95791-(10.93887)));
            yy = -29.92036 + (((tickAnim - 16) / 6) * (-32.98962-(-29.92036)));
            zz = 11.57854 + (((tickAnim - 16) / 6) * (28.24467-(11.57854)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -29.95791 + (((tickAnim - 22) / 8) * (-15.79881-(-29.95791)));
            yy = -32.98962 + (((tickAnim - 22) / 8) * (-26.57546-(-32.98962)));
            zz = 28.24467 + (((tickAnim - 22) / 8) * (4.68243-(28.24467)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(xx), Tentacle7a.rotateAngleY + (float) Math.toRadians(yy), Tentacle7a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -4.75 + (((tickAnim - 0) / 8) * (-4.11384-(-4.75)));
            yy = -20.25 + (((tickAnim - 0) / 8) * (-29.72031-(-20.25)));
            zz = 0 + (((tickAnim - 0) / 8) * (-3.27741-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -4.11384 + (((tickAnim - 8) / 3) * (-11.72483-(-4.11384)));
            yy = -29.72031 + (((tickAnim - 8) / 3) * (-21.82826-(-29.72031)));
            zz = -3.27741 + (((tickAnim - 8) / 3) * (-0.6044-(-3.27741)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -11.72483 + (((tickAnim - 11) / 5) * (-38.37152-(-11.72483)));
            yy = -21.82826 + (((tickAnim - 11) / 5) * (-13.9362-(-21.82826)));
            zz = -0.6044 + (((tickAnim - 11) / 5) * (2.06861-(-0.6044)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -38.37152 + (((tickAnim - 16) / 3) * (-3.67765-(-38.37152)));
            yy = -13.9362 + (((tickAnim - 16) / 3) * (-8.67483-(-13.9362)));
            zz = 2.06861 + (((tickAnim - 16) / 3) * (3.85062-(2.06861)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -3.67765 + (((tickAnim - 19) / 3) * (-4.48378-(-3.67765)));
            yy = -8.67483 + (((tickAnim - 19) / 3) * (-3.41347-(-8.67483)));
            zz = 3.85062 + (((tickAnim - 19) / 3) * (5.63262-(3.85062)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -4.48378 + (((tickAnim - 22) / 2) * (-4.66417-(-4.48378)));
            yy = -3.41347 + (((tickAnim - 22) / 2) * (-8.18248-(-3.41347)));
            zz = 5.63262 + (((tickAnim - 22) / 2) * (4.01981-(5.63262)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -4.66417 + (((tickAnim - 24) / 6) * (-4.75-(-4.66417)));
            yy = -8.18248 + (((tickAnim - 24) / 6) * (-20.25-(-8.18248)));
            zz = 4.01981 + (((tickAnim - 24) / 6) * (0-(4.01981)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7b, Tentacle7b.rotateAngleX + (float) Math.toRadians(xx), Tentacle7b.rotateAngleY + (float) Math.toRadians(yy), Tentacle7b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -16.81638 + (((tickAnim - 0) / 8) * (-16.67544-(-16.81638)));
            yy = -29.95139 + (((tickAnim - 0) / 8) * (-42.4314-(-29.95139)));
            zz = -1.75574 + (((tickAnim - 0) / 8) * (-2.47761-(-1.75574)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -16.67544 + (((tickAnim - 8) / 3) * (-16.34633-(-16.67544)));
            yy = -42.4314 + (((tickAnim - 8) / 3) * (-50.14613-(-42.4314)));
            zz = -2.47761 + (((tickAnim - 8) / 3) * (-3.02803-(-2.47761)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -16.34633 + (((tickAnim - 11) / 5) * (-56.97767-(-16.34633)));
            yy = -50.14613 + (((tickAnim - 11) / 5) * (-31.83693-(-50.14613)));
            zz = -3.02803 + (((tickAnim - 11) / 5) * (-1.93285-(-3.02803)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -56.97767 + (((tickAnim - 16) / 3) * (-15.06523-(-56.97767)));
            yy = -31.83693 + (((tickAnim - 16) / 3) * (-19.6308-(-31.83693)));
            zz = -1.93285 + (((tickAnim - 16) / 3) * (-1.20274-(-1.93285)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -15.06523 + (((tickAnim - 19) / 3) * (6.34721-(-15.06523)));
            yy = -19.6308 + (((tickAnim - 19) / 3) * (-7.42467-(-19.6308)));
            zz = -1.20274 + (((tickAnim - 19) / 3) * (-0.47262-(-1.20274)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 6.34721 + (((tickAnim - 22) / 2) * (-16.47802-(6.34721)));
            yy = -7.42467 + (((tickAnim - 22) / 2) * (-0.73103-(-7.42467)));
            zz = -0.47262 + (((tickAnim - 22) / 2) * (-0.02993-(-0.47262)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -16.47802 + (((tickAnim - 24) / 6) * (-16.81638-(-16.47802)));
            yy = -0.73103 + (((tickAnim - 24) / 6) * (-29.95139-(-0.73103)));
            zz = -0.02993 + (((tickAnim - 24) / 6) * (-1.75574-(-0.02993)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7c, Tentacle7c.rotateAngleX + (float) Math.toRadians(xx), Tentacle7c.rotateAngleY + (float) Math.toRadians(yy), Tentacle7c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 7.23966 + (((tickAnim - 0) / 6) * (6.71893-(7.23966)));
            yy = -56.54022 + (((tickAnim - 0) / 6) * (-42.96727-(-56.54022)));
            zz = -13.5484 + (((tickAnim - 0) / 6) * (-0.57167-(-13.5484)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 6.71893 + (((tickAnim - 6) / 6) * (9.36045-(6.71893)));
            yy = -42.96727 + (((tickAnim - 6) / 6) * (-29.63263-(-42.96727)));
            zz = -0.57167 + (((tickAnim - 6) / 6) * (12.89999-(-0.57167)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 9.36045 + (((tickAnim - 12) / 8) * (20.06321-(9.36045)));
            yy = -29.63263 + (((tickAnim - 12) / 8) * (-12.60095-(-29.63263)));
            zz = 12.89999 + (((tickAnim - 12) / 8) * (36.46797-(12.89999)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 20.06321 + (((tickAnim - 20) / 10) * (7.23966-(20.06321)));
            yy = -12.60095 + (((tickAnim - 20) / 10) * (-56.54022-(-12.60095)));
            zz = 36.46797 + (((tickAnim - 20) / 10) * (-13.5484-(36.46797)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle8a, Tentacle8a.rotateAngleX + (float) Math.toRadians(xx), Tentacle8a.rotateAngleY + (float) Math.toRadians(yy), Tentacle8a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 43.30168 + (((tickAnim - 0) / 6) * (20.5414-(43.30168)));
            yy = 48.2684 + (((tickAnim - 0) / 6) * (-33.34593-(48.2684)));
            zz = 31.02988 + (((tickAnim - 0) / 6) * (2.90574-(31.02988)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 20.5414 + (((tickAnim - 6) / 6) * (47.08066-(20.5414)));
            yy = -33.34593 + (((tickAnim - 6) / 6) * (-109.54248-(-33.34593)));
            zz = 2.90574 + (((tickAnim - 6) / 6) * (-28.42021-(2.90574)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 47.08066 + (((tickAnim - 12) / 8) * (0-(47.08066)));
            yy = -109.54248 + (((tickAnim - 12) / 8) * (-29.75-(-109.54248)));
            zz = -28.42021 + (((tickAnim - 12) / 8) * (0-(-28.42021)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (20.40375-(0)));
            yy = -29.75 + (((tickAnim - 20) / 6) * (19.87306-(-29.75)));
            zz = 0 + (((tickAnim - 20) / 6) * (15.49458-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 20.40375 + (((tickAnim - 26) / 4) * (43.30168-(20.40375)));
            yy = 19.87306 + (((tickAnim - 26) / 4) * (48.2684-(19.87306)));
            zz = 15.49458 + (((tickAnim - 26) / 4) * (31.02988-(15.49458)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle8b, Tentacle8b.rotateAngleX + (float) Math.toRadians(xx), Tentacle8b.rotateAngleY + (float) Math.toRadians(yy), Tentacle8b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.775-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 6) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 24) * (0-(0)));
            zz = 0.775 + (((tickAnim - 6) / 24) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tentacle8b.rotationPointX = this.Tentacle8b.rotationPointX + (float)(xx);
        this.Tentacle8b.rotationPointY = this.Tentacle8b.rotationPointY - (float)(yy);
        this.Tentacle8b.rotationPointZ = this.Tentacle8b.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 17.75 + (((tickAnim - 0) / 16) * (49.43703-(17.75)));
            yy = 0 + (((tickAnim - 0) / 16) * (9.56776-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (1.96102-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 49.43703 + (((tickAnim - 16) / 5) * (41.06225-(49.43703)));
            yy = 9.56776 + (((tickAnim - 16) / 5) * (5.15187-(9.56776)));
            zz = 1.96102 + (((tickAnim - 16) / 5) * (1.05593-(1.96102)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 41.06225 + (((tickAnim - 21) / 6) * (7.49096-(41.06225)));
            yy = 5.15187 + (((tickAnim - 21) / 6) * (2.20794-(5.15187)));
            zz = 1.05593 + (((tickAnim - 21) / 6) * (0.45254-(1.05593)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 7.49096 + (((tickAnim - 27) / 3) * (17.75-(7.49096)));
            yy = 2.20794 + (((tickAnim - 27) / 3) * (0-(2.20794)));
            zz = 0.45254 + (((tickAnim - 27) / 3) * (0-(0.45254)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle9b, Tentacle9b.rotateAngleX + (float) Math.toRadians(xx), Tentacle9b.rotateAngleY + (float) Math.toRadians(yy), Tentacle9b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 24.87994 + (((tickAnim - 0) / 6) * (7.37994-(24.87994)));
            yy = -11.97476 + (((tickAnim - 0) / 6) * (-11.97476-(-11.97476)));
            zz = -5.63009 + (((tickAnim - 0) / 6) * (-5.63009-(-5.63009)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 7.37994 + (((tickAnim - 6) / 6) * (-18.62006-(7.37994)));
            yy = -11.97476 + (((tickAnim - 6) / 6) * (-11.97476-(-11.97476)));
            zz = -5.63009 + (((tickAnim - 6) / 6) * (-5.63009-(-5.63009)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -18.62006 + (((tickAnim - 12) / 8) * (0.62994-(-18.62006)));
            yy = -11.97476 + (((tickAnim - 12) / 8) * (-11.97476-(-11.97476)));
            zz = -5.63009 + (((tickAnim - 12) / 8) * (-5.63009-(-5.63009)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.62994 + (((tickAnim - 20) / 10) * (24.87994-(0.62994)));
            yy = -11.97476 + (((tickAnim - 20) / 10) * (-11.97476-(-11.97476)));
            zz = -5.63009 + (((tickAnim - 20) / 10) * (-5.63009-(-5.63009)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(xx), Tentacle10a.rotateAngleY + (float) Math.toRadians(yy), Tentacle10a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0.85 + (((tickAnim - 0) / 30) * (0.85-(0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tentacle10a.rotationPointX = this.Tentacle10a.rotationPointX + (float)(xx);
        this.Tentacle10a.rotationPointY = this.Tentacle10a.rotationPointY - (float)(yy);
        this.Tentacle10a.rotationPointZ = this.Tentacle10a.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 17.5 + (((tickAnim - 0) / 6) * (53.5-(17.5)));
            yy = 23 + (((tickAnim - 0) / 6) * (23-(23)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 53.5 + (((tickAnim - 6) / 6) * (19.5-(53.5)));
            yy = 23 + (((tickAnim - 6) / 6) * (23-(23)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 19.5 + (((tickAnim - 12) / 4) * (5.66667-(19.5)));
            yy = 23 + (((tickAnim - 12) / 4) * (23-(23)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 5.66667 + (((tickAnim - 16) / 4) * (27.75-(5.66667)));
            yy = 23 + (((tickAnim - 16) / 4) * (23-(23)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 27.75 + (((tickAnim - 20) / 10) * (17.5-(27.75)));
            yy = 23 + (((tickAnim - 20) / 10) * (23-(23)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle10b, Tentacle10b.rotateAngleX + (float) Math.toRadians(xx), Tentacle10b.rotateAngleY + (float) Math.toRadians(yy), Tentacle10b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tentacle10b.rotationPointX = this.Tentacle10b.rotationPointX + (float)(xx);
        this.Tentacle10b.rotationPointY = this.Tentacle10b.rotationPointY - (float)(yy);
        this.Tentacle10b.rotationPointZ = this.Tentacle10b.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -48.52823 + (((tickAnim - 0) / 6) * (37.44187-(-48.52823)));
            yy = 3.29679 + (((tickAnim - 0) / 6) * (1.92313-(3.29679)));
            zz = -13.11931 + (((tickAnim - 0) / 6) * (-7.65293-(-13.11931)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 37.44187 + (((tickAnim - 6) / 6) * (88.5-(37.44187)));
            yy = 1.92313 + (((tickAnim - 6) / 6) * (0-(1.92313)));
            zz = -7.65293 + (((tickAnim - 6) / 6) * (0-(-7.65293)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 88.5 + (((tickAnim - 12) / 4) * (4.29-(88.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 4.29 + (((tickAnim - 16) / 4) * (-21.5-(4.29)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -21.5 + (((tickAnim - 20) / 10) * (-48.52823-(-21.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (3.29679-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-13.11931-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle10c, Tentacle10c.rotateAngleX + (float) Math.toRadians(xx), Tentacle10c.rotateAngleY + (float) Math.toRadians(yy), Tentacle10c.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Shell1, Shell1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-20))*-0.2), Shell1.rotateAngleY + (float) Math.toRadians(0), Shell1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Mantle1, Mantle1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*-0.5), Mantle1.rotateAngleY + (float) Math.toRadians(0), Mantle1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-73.75-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = -73.75 + (((tickAnim - 6) / 6) * (132.75-(-73.75)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 132.75 + (((tickAnim - 12) / 8) * (0-(132.75)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (-17-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = -17 + (((tickAnim - 26) / 4) * (0-(-17)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle3c, Tentacle3c.rotateAngleX + (float) Math.toRadians(xx), Tentacle3c.rotateAngleY + (float) Math.toRadians(yy), Tentacle3c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (73-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 73 + (((tickAnim - 6) / 6) * (106.75-(73)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 106.75 + (((tickAnim - 12) / 4) * (25.25-(106.75)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 25.25 + (((tickAnim - 16) / 4) * (-16.75-(25.25)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = -16.75 + (((tickAnim - 20) / 6) * (28.19-(-16.75)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 28.19 + (((tickAnim - 26) / 4) * (0-(28.19)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle8c, Tentacle8c.rotateAngleX + (float) Math.toRadians(xx), Tentacle8c.rotateAngleY + (float) Math.toRadians(yy), Tentacle8c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (59.06249-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-9.43458-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (23.26771-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 59.06249 + (((tickAnim - 16) / 5) * (15.25288-(59.06249)));
            yy = -9.43458 + (((tickAnim - 16) / 5) * (-5.08016-(-9.43458)));
            zz = 23.26771 + (((tickAnim - 16) / 5) * (12.52877-(23.26771)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 15.25288 + (((tickAnim - 21) / 6) * (-8.22734-(15.25288)));
            yy = -5.08016 + (((tickAnim - 21) / 6) * (-2.17721-(-5.08016)));
            zz = 12.52877 + (((tickAnim - 21) / 6) * (1.49447-(12.52877)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -8.22734 + (((tickAnim - 27) / 3) * (0-(-8.22734)));
            yy = -2.17721 + (((tickAnim - 27) / 3) * (0-(-2.17721)));
            zz = 1.49447 + (((tickAnim - 27) / 3) * (0-(1.49447)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(xx), Tentacle9a.rotateAngleY + (float) Math.toRadians(yy), Tentacle9a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-62.57336-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (34.03037-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-20.15458-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -62.57336 + (((tickAnim - 8) / 8) * (-86.16148-(-62.57336)));
            yy = 34.03037 + (((tickAnim - 8) / 8) * (35.65594-(34.03037)));
            zz = -20.15458 + (((tickAnim - 8) / 8) * (-16.23205-(-20.15458)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -86.16148 + (((tickAnim - 16) / 5) * (108.10536-(-86.16148)));
            yy = 35.65594 + (((tickAnim - 16) / 5) * (19.19935-(35.65594)));
            zz = -16.23205 + (((tickAnim - 16) / 5) * (-8.74034-(-16.23205)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 108.10536 + (((tickAnim - 21) / 6) * (6.83087-(108.10536)));
            yy = 19.19935 + (((tickAnim - 21) / 6) * (8.22829-(19.19935)));
            zz = -8.74034 + (((tickAnim - 21) / 6) * (-3.74586-(-8.74034)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 6.83087 + (((tickAnim - 27) / 3) * (0-(6.83087)));
            yy = 8.22829 + (((tickAnim - 27) / 3) * (0-(8.22829)));
            zz = -3.74586 + (((tickAnim - 27) / 3) * (0-(-3.74586)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle9c, Tentacle9c.rotateAngleX + (float) Math.toRadians(xx), Tentacle9c.rotateAngleY + (float) Math.toRadians(yy), Tentacle9c.rotateAngleZ + (float) Math.toRadians(zz));

    }


}
