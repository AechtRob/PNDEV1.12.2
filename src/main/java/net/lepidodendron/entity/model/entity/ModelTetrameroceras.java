package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraTetrameroceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;

public class ModelTetrameroceras extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer eyeLeft;
    private final AdvancedModelRenderer eyeRight;
    private final AdvancedModelRenderer tentacle1a;
    private final AdvancedModelRenderer tentacle1b;
    private final AdvancedModelRenderer tentacle1c;
    private final AdvancedModelRenderer tentacle2a;
    private final AdvancedModelRenderer tentacle2b;
    private final AdvancedModelRenderer tentacle2c;
    private final AdvancedModelRenderer tentacle3a;
    private final AdvancedModelRenderer tentacle3b;
    private final AdvancedModelRenderer tentacle3c;
    private final AdvancedModelRenderer tentacle4a;
    private final AdvancedModelRenderer tentacle4b;
    private final AdvancedModelRenderer tentacle4c;
    private final AdvancedModelRenderer tentacle5a;
    private final AdvancedModelRenderer tentacle5b;
    private final AdvancedModelRenderer tentacle5c;
    private final AdvancedModelRenderer tentacle6a;
    private final AdvancedModelRenderer tentacle6b;
    private final AdvancedModelRenderer tentacle6c;
    private final AdvancedModelRenderer tentacle7a;
    private final AdvancedModelRenderer tentacle7b;
    private final AdvancedModelRenderer tentacle7c;
    private final AdvancedModelRenderer tentacle8a;
    private final AdvancedModelRenderer tentacle8b;
    private final AdvancedModelRenderer tentacle8c;
    private final AdvancedModelRenderer tentacle9a;
    private final AdvancedModelRenderer tentacle9b;
    private final AdvancedModelRenderer tentacle9c;
    private final AdvancedModelRenderer tentacle10a;
    private final AdvancedModelRenderer tentacle10b;
    private final AdvancedModelRenderer tentacle10c;

    public ModelTetrameroceras() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -18.569F, 1.5911F);
        this.root.addChild(shell);
        this.setRotateAngle(shell, 0.6981F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 57, -3.5F, 1.2802F, 2.0326F, 7, 3, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.49F, 6.9066F, -8.8344F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.9599F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 54, 35, -3.99F, -2.8809F, -3.8247F, 7, 3, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.01F, 3.7347F, -11.1209F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 45, -2.49F, -4.8936F, 0.0139F, 7, 5, 5, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.01F, -0.1436F, 7.1491F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -2.0508F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 9, -3.49F, 0.5F, -4.0F, 7, 3, 9, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.01F, -5.4865F, 7.1194F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.6144F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 55, -3.49F, -1.5F, -2.5F, 7, 3, 4, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.01F, -8.5549F, 5.4339F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -2.2253F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 50, 21, -3.49F, -3.0F, -1.5F, 7, 4, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.01F, -4.7066F, -0.5586F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.3963F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 39, -3.49F, -7.0F, -4.5F, 7, 4, 7, -0.04F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.01F, -4.3536F, 0.5649F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.1781F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 18, -3.49F, -3.0F, -4.5F, 7, 7, 9, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.51F, -1.1754F, -4.0684F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7418F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 46, -2.99F, -3.75F, -4.5F, 7, 8, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.8907F, -3.1126F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6981F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 0, -4.0F, -12.85F, -3.325F, 8, 3, 6, 0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 26, -4.5F, -9.85F, -4.825F, 9, 5, 8, 0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -5.0F, -4.85F, -5.825F, 10, 8, 10, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 7.7467F, -0.3433F);
        this.shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.3177F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 4, -1.0F, 0.25F, 0.5F, 2, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.99F, 4.1437F, 2.5364F);
        this.shell.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6981F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 54, 5, -4.49F, -1.5F, -2.0F, 7, 4, 4, 0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.49F, 7.1711F, -1.1138F);
        this.shell.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.1868F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 50, -3.99F, -3.25F, -2.5F, 7, 5, 4, 0.03F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 7.0829F, -8.7948F);
        this.shell.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 34, -3.5F, -4.945F, -0.0342F, 7, 5, 7, 0.04F, false));

        this.eyeLeft = new AdvancedModelRenderer(this);
        this.eyeLeft.setRotationPoint(3.0F, -9.65F, -2.75F);
        this.root.addChild(eyeLeft);
        this.setRotateAngle(eyeLeft, 0.0F, 0.7418F, 0.0F);
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 0, 2, 0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.eyeRight = new AdvancedModelRenderer(this);
        this.eyeRight.setRotationPoint(-3.0F, -9.65F, -2.75F);
        this.root.addChild(eyeRight);
        this.setRotateAngle(eyeRight, 0.0F, -0.7418F, 0.0F);
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 0, 0, -4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.tentacle1a = new AdvancedModelRenderer(this);
        this.tentacle1a.setRotationPoint(0.725F, -8.5F, -1.4F);
        this.root.addChild(tentacle1a);
        this.setRotateAngle(tentacle1a, 1.0031F, 0.0322F, -0.0295F);
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 30, 21, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle1b = new AdvancedModelRenderer(this);
        this.tentacle1b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle1a.addChild(tentacle1b);
        this.setRotateAngle(tentacle1b, -0.3054F, 0.0F, -0.2182F);
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 30, 0, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle1c = new AdvancedModelRenderer(this);
        this.tentacle1c.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle1b.addChild(tentacle1c);
        this.setRotateAngle(tentacle1c, -0.6504F, 0.0124F, 0.1388F);
        this.tentacle1c.cubeList.add(new ModelBox(tentacle1c, 26, 22, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle2a = new AdvancedModelRenderer(this);
        this.tentacle2a.setRotationPoint(2.1F, -8.5F, 0.35F);
        this.root.addChild(tentacle2a);
        this.setRotateAngle(tentacle2a, 0.8293F, 1.0316F, 0.0131F);
        this.tentacle2a.cubeList.add(new ModelBox(tentacle2a, 42, 21, -0.4064F, 0.222F, -0.2226F, 1, 4, 1, 0.0F, false));

        this.tentacle2b = new AdvancedModelRenderer(this);
        this.tentacle2b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle2a.addChild(tentacle2b);
        this.setRotateAngle(tentacle2b, -0.3655F, 0.147F, 0.3655F);
        this.tentacle2b.cubeList.add(new ModelBox(tentacle2b, 38, 21, -0.4064F, 0.222F, -0.2226F, 1, 4, 1, 0.0F, false));

        this.tentacle2c = new AdvancedModelRenderer(this);
        this.tentacle2c.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle2b.addChild(tentacle2c);
        this.setRotateAngle(tentacle2c, -0.413F, -0.1451F, -0.3186F);
        this.tentacle2c.cubeList.add(new ModelBox(tentacle2c, 4, 23, -0.4064F, 0.222F, -0.2226F, 1, 3, 1, 0.0F, false));

        this.tentacle3a = new AdvancedModelRenderer(this);
        this.tentacle3a.setRotationPoint(2.95F, -8.5F, -0.225F);
        this.root.addChild(tentacle3a);
        this.setRotateAngle(tentacle3a, 0.2194F, -0.2143F, -0.8091F);
        this.tentacle3a.cubeList.add(new ModelBox(tentacle3a, 50, 29, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle3b = new AdvancedModelRenderer(this);
        this.tentacle3b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle3a.addChild(tentacle3b);
        this.setRotateAngle(tentacle3b, -0.3339F, 0.0886F, 0.3381F);
        this.tentacle3b.cubeList.add(new ModelBox(tentacle3b, 46, 39, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle3c = new AdvancedModelRenderer(this);
        this.tentacle3c.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle3b.addChild(tentacle3c);
        this.setRotateAngle(tentacle3c, 0.2182F, 0.0F, 0.4363F);
        this.tentacle3c.cubeList.add(new ModelBox(tentacle3c, 20, 50, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tentacle4a = new AdvancedModelRenderer(this);
        this.tentacle4a.setRotationPoint(2.775F, -8.5F, -2.0F);
        this.root.addChild(tentacle4a);
        this.setRotateAngle(tentacle4a, -0.829F, -1.0036F, 0.0F);
        this.tentacle4a.cubeList.add(new ModelBox(tentacle4a, 54, 29, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle4b = new AdvancedModelRenderer(this);
        this.tentacle4b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle4a.addChild(tentacle4b);
        this.setRotateAngle(tentacle4b, 0.4323F, 0.1313F, -0.3244F);
        this.tentacle4b.cubeList.add(new ModelBox(tentacle4b, 54, 13, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle4c = new AdvancedModelRenderer(this);
        this.tentacle4c.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle4b.addChild(tentacle4c);
        this.setRotateAngle(tentacle4c, 0.3806F, -0.0992F, 0.2427F);
        this.tentacle4c.cubeList.add(new ModelBox(tentacle4c, 38, 50, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tentacle5a = new AdvancedModelRenderer(this);
        this.tentacle5a.setRotationPoint(2.15F, -8.5F, -2.7F);
        this.root.addChild(tentacle5a);
        this.setRotateAngle(tentacle5a, -0.9275F, -0.9182F, 0.1084F);
        this.tentacle5a.cubeList.add(new ModelBox(tentacle5a, 20, 59, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle5b = new AdvancedModelRenderer(this);
        this.tentacle5b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle5a.addChild(tentacle5b);
        this.setRotateAngle(tentacle5b, 0.3734F, -0.2175F, 0.2234F);
        this.tentacle5b.cubeList.add(new ModelBox(tentacle5b, 58, 29, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle5c = new AdvancedModelRenderer(this);
        this.tentacle5c.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle5b.addChild(tentacle5c);
        this.setRotateAngle(tentacle5c, 0.413F, 0.1451F, -0.3186F);
        this.tentacle5c.cubeList.add(new ModelBox(tentacle5c, 24, 59, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tentacle6a = new AdvancedModelRenderer(this);
        this.tentacle6a.setRotationPoint(-0.725F, -8.5F, -1.4F);
        this.root.addChild(tentacle6a);
        this.setRotateAngle(tentacle6a, 1.0031F, -0.0322F, 0.0295F);
        this.tentacle6a.cubeList.add(new ModelBox(tentacle6a, 23, 18, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle6b = new AdvancedModelRenderer(this);
        this.tentacle6b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle6a.addChild(tentacle6b);
        this.setRotateAngle(tentacle6b, -0.3054F, 0.0F, 0.2182F);
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 4, 18, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle6c = new AdvancedModelRenderer(this);
        this.tentacle6c.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle6b.addChild(tentacle6c);
        this.setRotateAngle(tentacle6c, -0.6504F, -0.0124F, -0.1388F);
        this.tentacle6c.cubeList.add(new ModelBox(tentacle6c, 0, 18, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle7a = new AdvancedModelRenderer(this);
        this.tentacle7a.setRotationPoint(-2.1F, -8.5F, 0.35F);
        this.root.addChild(tentacle7a);
        this.setRotateAngle(tentacle7a, 0.8293F, -1.0316F, -0.0131F);
        this.tentacle7a.cubeList.add(new ModelBox(tentacle7a, 34, 21, -0.5936F, 0.222F, -0.2226F, 1, 4, 1, 0.0F, false));

        this.tentacle7b = new AdvancedModelRenderer(this);
        this.tentacle7b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle7a.addChild(tentacle7b);
        this.setRotateAngle(tentacle7b, -0.3655F, -0.147F, -0.3655F);
        this.tentacle7b.cubeList.add(new ModelBox(tentacle7b, 0, 34, -0.5936F, 0.222F, -0.2226F, 1, 4, 1, 0.0F, false));

        this.tentacle7c = new AdvancedModelRenderer(this);
        this.tentacle7c.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle7b.addChild(tentacle7c);
        this.setRotateAngle(tentacle7c, -0.413F, 0.1451F, 0.3186F);
        this.tentacle7c.cubeList.add(new ModelBox(tentacle7c, 0, 23, -0.5936F, 0.222F, -0.2226F, 1, 3, 1, 0.0F, false));

        this.tentacle8a = new AdvancedModelRenderer(this);
        this.tentacle8a.setRotationPoint(-2.95F, -8.5F, -0.225F);
        this.root.addChild(tentacle8a);
        this.setRotateAngle(tentacle8a, 0.2194F, 0.2143F, 0.8091F);
        this.tentacle8a.cubeList.add(new ModelBox(tentacle8a, 46, 21, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle8b = new AdvancedModelRenderer(this);
        this.tentacle8b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle8a.addChild(tentacle8b);
        this.setRotateAngle(tentacle8b, -0.3339F, -0.0886F, -0.3381F);
        this.tentacle8b.cubeList.add(new ModelBox(tentacle8b, 42, 39, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle8c = new AdvancedModelRenderer(this);
        this.tentacle8c.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle8b.addChild(tentacle8c);
        this.setRotateAngle(tentacle8c, 0.2182F, 0.0F, -0.4363F);
        this.tentacle8c.cubeList.add(new ModelBox(tentacle8c, 27, 18, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tentacle9a = new AdvancedModelRenderer(this);
        this.tentacle9a.setRotationPoint(-2.775F, -8.5F, -2.0F);
        this.root.addChild(tentacle9a);
        this.setRotateAngle(tentacle9a, -0.829F, 1.0036F, 0.0F);
        this.tentacle9a.cubeList.add(new ModelBox(tentacle9a, 52, 0, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle9b = new AdvancedModelRenderer(this);
        this.tentacle9b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle9a.addChild(tentacle9b);
        this.setRotateAngle(tentacle9b, 0.4323F, -0.1313F, 0.3244F);
        this.tentacle9b.cubeList.add(new ModelBox(tentacle9b, 50, 39, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle9c = new AdvancedModelRenderer(this);
        this.tentacle9c.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle9b.addChild(tentacle9c);
        this.setRotateAngle(tentacle9c, 0.3806F, 0.0992F, -0.2427F);
        this.tentacle9c.cubeList.add(new ModelBox(tentacle9c, 50, 21, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tentacle10a = new AdvancedModelRenderer(this);
        this.tentacle10a.setRotationPoint(-2.15F, -8.5F, -2.7F);
        this.root.addChild(tentacle10a);
        this.setRotateAngle(tentacle10a, -0.9275F, 0.9182F, -0.1084F);
        this.tentacle10a.cubeList.add(new ModelBox(tentacle10a, 58, 13, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle10b = new AdvancedModelRenderer(this);
        this.tentacle10b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle10a.addChild(tentacle10b);
        this.setRotateAngle(tentacle10b, 0.3734F, 0.2175F, -0.2234F);
        this.tentacle10b.cubeList.add(new ModelBox(tentacle10b, 56, 0, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.tentacle10c = new AdvancedModelRenderer(this);
        this.tentacle10c.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tentacle10b.addChild(tentacle10c);
        this.setRotateAngle(tentacle10c, 0.413F, -0.1451F, 0.3186F);
        this.tentacle10c.cubeList.add(new ModelBox(tentacle10c, 56, 55, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(tentacle9c, 0.3806F, 0.0992F, -0.2427F);
        this.setRotateAngle(tentacle9b, 0.4323F, -0.1313F, 0.3244F);
        this.setRotateAngle(tentacle9a, -0.829F, 1.0036F, 0.0F);
        this.setRotateAngle(tentacle8c, 0.2182F, 0.0F, -0.4363F);
        this.setRotateAngle(tentacle8b, -0.3339F, -0.0886F, -0.3381F);
        this.setRotateAngle(tentacle8a, 0.2194F, 0.2143F, 0.8091F);
        this.setRotateAngle(tentacle7c, -0.413F, 0.1451F, 0.3186F);
        this.setRotateAngle(tentacle7b, -0.3655F, -0.147F, -0.3655F);
        this.setRotateAngle(tentacle7a, 0.8293F, -1.0316F, -0.0131F);
        this.setRotateAngle(tentacle6c, -0.6504F, -0.0124F, -0.1388F);
        this.setRotateAngle(tentacle6b, -0.3054F, 0.0F, 0.2182F);
        this.setRotateAngle(tentacle6a, 1.0031F, -0.0322F, 0.0295F);
        this.setRotateAngle(tentacle5c, 0.413F, 0.1451F, -0.3186F);
        this.setRotateAngle(tentacle5b, 0.3734F, -0.2175F, 0.2234F);
        this.setRotateAngle(tentacle5a, -0.9275F, -0.9182F, 0.1084F);
        this.setRotateAngle(tentacle4c, 0.3806F, -0.0992F, 0.2427F);
        this.setRotateAngle(tentacle4b, 0.4323F, 0.1313F, -0.3244F);
        this.setRotateAngle(tentacle4a, -0.829F, -1.0036F, 0.0F);
        this.setRotateAngle(tentacle3c, 0.2182F, 0.0F, 0.4363F);
        this.setRotateAngle(tentacle3b, -0.3339F, 0.0886F, 0.3381F);
        this.setRotateAngle(tentacle3a, 0.2194F, -0.2143F, -0.8091F);
        this.setRotateAngle(tentacle2c, -0.413F, -0.1451F, -0.3186F);
        this.setRotateAngle(tentacle2b, -0.3655F, 0.147F, 0.3655F);
        this.setRotateAngle(tentacle2a, 0.8293F, 1.0316F, 0.0131F);
        this.setRotateAngle(tentacle1c, -0.6504F, 0.0124F, 0.1388F);
        this.setRotateAngle(tentacle1b, -0.3054F, 0.0F, -0.2182F);
        this.setRotateAngle(tentacle1a, 1.0031F, 0.0322F, -0.0295F);
        this.setRotateAngle(tentacle10c, 0.413F, -0.1451F, 0.3186F);
        this.setRotateAngle(tentacle10b, 0.3734F, 0.2175F, -0.2234F);
        this.setRotateAngle(tentacle10a, -0.9275F, 0.9182F, -0.1084F);
        this.setRotateAngle(shell, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(eyeRight, 0.0F, -0.7418F, 0.0F);
        this.setRotateAngle(eyeLeft, 0.0F, 0.7418F, 0.0F);
        this.setRotateAngle(cube_r9, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -1.1781F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -1.3963F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -2.2253F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -1.6144F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -2.0508F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -1.1868F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -1.3177F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.9599F, 0.0F, 0.0F);
        this.root.offsetY = 0.16F;
        this.root.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.0F;
        this.root.offsetX = -1.338F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 1.63F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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



        //this.resetToDefaultPose();
        //this.root.offsetY = 1.2F;
        //this.root.offsetZ = -1F;

        if(!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = -0.3F;
            this.root.offsetX = -1F;
        }


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTetrameroceras ee = (EntityPrehistoricFloraTetrameroceras) entitylivingbaseIn;

        boolean isAtBottom = false;
        if (ee.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(ee.getPosition().getX(), ee.getPosition().getY() - 1, ee.getPosition().getZ());
            isAtBottom = ((ee.isInsideOfMaterial(Material.WATER) || ee.isInsideOfMaterial(Material.CORAL))
                    && ((ee.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)ee.getPosition().getY() + 0.334D) > ee.posY);
        }

        if (ee.getIsMoving() && isAtBottom && ee.isReallyInWater()) { //walking
            animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        } else if (!isAtBottom && ee.isReallyInWater()){
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }


    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTetrameroceras entity = (EntityPrehistoricFloraTetrameroceras) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+120+50))*2), root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+190+90))*1.5), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+130-70))));
        this.root.rotationPointX = this.root.rotationPointX + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+100+30))*0.1);
        this.root.rotationPointY = this.root.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+150-90))*0.1);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (-10.09541-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (-16.78457-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (-2.30998-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 39) {
            xx = -10.09541 + (((tickAnim - 17) / 22) * (-10.09541-(-10.09541)));
            yy = -16.78457 + (((tickAnim - 17) / 22) * (-16.78457-(-16.78457)));
            zz = -2.30998 + (((tickAnim - 17) / 22) * (-2.30998-(-2.30998)));
        }
        else if (tickAnim >= 39 && tickAnim < 47) {
            xx = -10.09541 + (((tickAnim - 39) / 8) * (-3.88682-(-10.09541)));
            yy = -16.78457 + (((tickAnim - 39) / 8) * (-1.28784-(-16.78457)));
            zz = -2.30998 + (((tickAnim - 39) / 8) * (17.32438-(-2.30998)));
        }
        else if (tickAnim >= 47 && tickAnim < 67) {
            xx = -3.88682 + (((tickAnim - 47) / 20) * (-3.88682-(-3.88682)));
            yy = -1.28784 + (((tickAnim - 47) / 20) * (-1.28784-(-1.28784)));
            zz = 17.32438 + (((tickAnim - 47) / 20) * (17.32438-(17.32438)));
        }
        else if (tickAnim >= 67 && tickAnim < 80) {
            xx = -3.88682 + (((tickAnim - 67) / 13) * (0-(-3.88682)));
            yy = -1.28784 + (((tickAnim - 67) / 13) * (0-(-1.28784)));
            zz = 17.32438 + (((tickAnim - 67) / 13) * (0-(17.32438)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyeLeft, eyeLeft.rotateAngleX + (float) Math.toRadians(xx), eyeLeft.rotateAngleY + (float) Math.toRadians(yy), eyeLeft.rotateAngleZ + (float) Math.toRadians(zz));
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (-15-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (20-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 24) / 23) * (0-(0)));
            yy = -15 + (((tickAnim - 24) / 23) * (-15-(-15)));
            zz = 20 + (((tickAnim - 24) / 23) * (20-(20)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 47) / 7) * (-3.88682-(0)));
            yy = -15 + (((tickAnim - 47) / 7) * (-1.28784-(-15)));
            zz = 20 + (((tickAnim - 47) / 7) * (17.32438-(20)));
        }
        else if (tickAnim >= 54 && tickAnim < 74) {
            xx = -3.88682 + (((tickAnim - 54) / 20) * (-3.88682-(-3.88682)));
            yy = -1.28784 + (((tickAnim - 54) / 20) * (-1.28784-(-1.28784)));
            zz = 17.32438 + (((tickAnim - 54) / 20) * (17.32438-(17.32438)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = -3.88682 + (((tickAnim - 74) / 6) * (0-(-3.88682)));
            yy = -1.28784 + (((tickAnim - 74) / 6) * (0-(-1.28784)));
            zz = 17.32438 + (((tickAnim - 74) / 6) * (0-(17.32438)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyeRight, eyeRight.rotateAngleX + (float) Math.toRadians(xx), eyeRight.rotateAngleY + (float) Math.toRadians(yy), eyeRight.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tentacle10a, tentacle10a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10), tentacle10a.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*10), tentacle10a.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10));
        this.setRotateAngle(tentacle10b, tentacle10b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10), tentacle10b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*10), tentacle10b.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10));
        this.setRotateAngle(tentacle10c, tentacle10c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10), tentacle10c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*10), tentacle10c.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10));
        this.setRotateAngle(tentacle9a, tentacle9a.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10), tentacle9a.rotateAngleY + (float) Math.toRadians(30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*20), tentacle9a.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10));
        this.setRotateAngle(tentacle9b, tentacle9b.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10), tentacle9b.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*10), tentacle9b.rotateAngleZ + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10));
        this.setRotateAngle(tentacle9c, tentacle9c.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10), tentacle9c.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*10), tentacle9c.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10));
        this.setRotateAngle(tentacle8a, tentacle8a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-160))*10), tentacle8a.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*10), tentacle8a.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*10));
        this.setRotateAngle(tentacle8b, tentacle8b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-130))*10), tentacle8b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-80))*10), tentacle8b.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*10));
        this.setRotateAngle(tentacle8c, tentacle8c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-160))*10), tentacle8c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*10), tentacle8c.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*10));
        this.setRotateAngle(tentacle6a, tentacle6a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*10), tentacle6a.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*10), tentacle6a.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+250))*10));
        this.setRotateAngle(tentacle6b, tentacle6b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-40))*10), tentacle6b.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*10), tentacle6b.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*10));
        this.setRotateAngle(tentacle6c, tentacle6c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-190))*10), tentacle6c.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*10), tentacle6c.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*10));
        this.setRotateAngle(tentacle7a, tentacle7a.rotateAngleX + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-110))*10), tentacle7a.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-160))*10), tentacle7a.rotateAngleZ + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-210))*5));
        this.setRotateAngle(tentacle7b, tentacle7b.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+20))*10), tentacle7b.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-160))*10), tentacle7b.rotateAngleZ + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+110))*10));
        this.setRotateAngle(tentacle1a, tentacle1a.rotateAngleX + (float) Math.toRadians(xx), tentacle1a.rotateAngleY + (float) Math.toRadians(yy), tentacle1a.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tentacle1b, tentacle1b.rotateAngleX + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-140))*10)), tentacle1b.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*10), tentacle1b.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*10)));
        this.setRotateAngle(tentacle1c, tentacle1c.rotateAngleX + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-190))*10)), tentacle1c.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*10), tentacle1c.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*10)));
        this.setRotateAngle(tentacle2a, tentacle2a.rotateAngleX + (float) Math.toRadians(-(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*20)), tentacle2a.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*20), tentacle2a.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-20))*10));
        this.setRotateAngle(tentacle2b, tentacle2b.rotateAngleX + (float) Math.toRadians(-(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+120))*20)), tentacle2b.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+160))*10), tentacle2b.rotateAngleZ + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-10))*10));
        this.setRotateAngle(tentacle2c, tentacle2c.rotateAngleX + (float) Math.toRadians(-(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+120))*20)), tentacle2c.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+160))*10), tentacle2c.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-10))*10));
        this.setRotateAngle(tentacle3a, tentacle3a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-160))*10), tentacle3a.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))*10), tentacle3a.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+250))*10));
        this.setRotateAngle(tentacle3b, tentacle3b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-130))*10), tentacle3b.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+80))*10), tentacle3b.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+50))*10));
        this.setRotateAngle(tentacle3c, tentacle3c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-160))*10), tentacle3c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))*10), tentacle3c.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+250))*10));
        this.setRotateAngle(tentacle4a, tentacle4a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10), tentacle4a.rotateAngleY + (float) Math.toRadians(-30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*20), tentacle4a.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10));
        this.setRotateAngle(tentacle4b, tentacle4b.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10), tentacle4b.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*20), tentacle4b.rotateAngleZ + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10));
        this.setRotateAngle(tentacle4c, tentacle4c.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10), tentacle4c.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*20), tentacle4c.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10));
        this.setRotateAngle(tentacle5a, tentacle5a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-230))*20), tentacle5a.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+260))*20), tentacle5a.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*20));
        this.setRotateAngle(tentacle5b, tentacle5b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-130))*10), tentacle5b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+260))*10), tentacle5b.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10));
        this.setRotateAngle(tentacle5c, tentacle5c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-130))*10), tentacle5c.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+160))*10), tentacle5c.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*10));
        this.setRotateAngle(tentacle7c, tentacle7c.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+120))*10), tentacle7c.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-260))*10), tentacle7c.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+110))*10));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTetrameroceras entity = (EntityPrehistoricFloraTetrameroceras) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+120+50))*20), root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+190+90))*2), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+130-70))*4));
        this.root.rotationPointX = this.root.rotationPointX + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+100+30))*0.1);
        this.root.rotationPointY = this.root.rotationPointY - (float)(5.4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+150+150))*6.3);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(-0.7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+100+70))*4);


        this.setRotateAngle(eyeLeft, eyeLeft.rotateAngleX + (float) Math.toRadians(0), eyeLeft.rotateAngleY + (float) Math.toRadians(-5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+190+200))*5), eyeLeft.rotateAngleZ + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+130+80))*20));


        this.setRotateAngle(eyeRight, eyeRight.rotateAngleX + (float) Math.toRadians(0), eyeRight.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+190+160))*5), eyeRight.rotateAngleZ + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+130+50))*30));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 52.53398 + (((tickAnim - 0) / 5) * (72.53398-(52.53398)));
            yy = 2.4999 + (((tickAnim - 0) / 5) * (2.4999-(2.4999)));
            zz = -0.0435 + (((tickAnim - 0) / 5) * (-0.0435-(-0.0435)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 72.53398 + (((tickAnim - 5) / 10) * (65.03358-(72.53398)));
            yy = 2.4999 + (((tickAnim - 5) / 10) * (3.5211-(2.4999)));
            zz = -0.0435 + (((tickAnim - 5) / 10) * (6.2622-(-0.0435)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 65.03358 + (((tickAnim - 15) / 10) * (-39.96602-(65.03358)));
            yy = 3.5211 + (((tickAnim - 15) / 10) * (2.4999-(3.5211)));
            zz = 6.2622 + (((tickAnim - 15) / 10) * (-0.0435-(6.2622)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -39.96602 + (((tickAnim - 25) / 11) * (52.53398-(-39.96602)));
            yy = 2.4999 + (((tickAnim - 25) / 11) * (2.4999-(2.4999)));
            zz = -0.0435 + (((tickAnim - 25) / 11) * (-0.0435-(-0.0435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle5a, tentacle5a.rotateAngleX + (float) Math.toRadians(xx), tentacle5a.rotateAngleY + (float) Math.toRadians(yy), tentacle5a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -47.5 + (((tickAnim - 0) / 5) * (-27.81081-(-47.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (16.9775-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-29.2355-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -27.81081 + (((tickAnim - 5) / 10) * (-27.81081-(-27.81081)));
            yy = 16.9775 + (((tickAnim - 5) / 10) * (16.9775-(16.9775)));
            zz = -29.2355 + (((tickAnim - 5) / 10) * (-29.2355-(-29.2355)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -27.81081 + (((tickAnim - 15) / 5) * (18.49346-(-27.81081)));
            yy = 16.9775 + (((tickAnim - 15) / 5) * (13.4303-(16.9775)));
            zz = -29.2355 + (((tickAnim - 15) / 5) * (-13.8478-(-29.2355)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 18.49346 + (((tickAnim - 20) / 5) * (19.79774-(18.49346)));
            yy = 13.4303 + (((tickAnim - 20) / 5) * (9.8831-(13.4303)));
            zz = -13.8478 + (((tickAnim - 20) / 5) * (1.5399-(-13.8478)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 19.79774 + (((tickAnim - 25) / 5) * (-26.26275-(19.79774)));
            yy = 9.8831 + (((tickAnim - 25) / 5) * (5.32167-(9.8831)));
            zz = 1.5399 + (((tickAnim - 25) / 5) * (0.82918-(1.5399)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -26.26275 + (((tickAnim - 30) / 3) * (-52.86443-(-26.26275)));
            yy = 5.32167 + (((tickAnim - 30) / 3) * (3.04095-(5.32167)));
            zz = 0.82918 + (((tickAnim - 30) / 3) * (0.47382-(0.82918)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -52.86443 + (((tickAnim - 33) / 3) * (-47.5-(-52.86443)));
            yy = 3.04095 + (((tickAnim - 33) / 3) * (0-(3.04095)));
            zz = 0.47382 + (((tickAnim - 33) / 3) * (0-(0.47382)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle5b, tentacle5b.rotateAngleX + (float) Math.toRadians(xx), tentacle5b.rotateAngleY + (float) Math.toRadians(yy), tentacle5b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -65.86138 + (((tickAnim - 0) / 5) * (1.054-(-65.86138)));
            yy = 12.0579 + (((tickAnim - 0) / 5) * (19.2939-(12.0579)));
            zz = 16.5097 + (((tickAnim - 0) / 5) * (8.9462-(16.5097)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 1.054 + (((tickAnim - 5) / 10) * (-13.946-(1.054)));
            yy = 19.2939 + (((tickAnim - 5) / 10) * (19.2939-(19.2939)));
            zz = 8.9462 + (((tickAnim - 5) / 10) * (8.9462-(8.9462)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -13.946 + (((tickAnim - 15) / 5) * (23.74884-(-13.946)));
            yy = 19.2939 + (((tickAnim - 15) / 5) * (12.36045-(19.2939)));
            zz = 8.9462 + (((tickAnim - 15) / 5) * (16.64585-(8.9462)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 23.74884 + (((tickAnim - 20) / 5) * (16.44368-(23.74884)));
            yy = 12.36045 + (((tickAnim - 20) / 5) * (5.427-(12.36045)));
            zz = 16.64585 + (((tickAnim - 20) / 5) * (24.3455-(16.64585)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 16.44368 + (((tickAnim - 25) / 5) * (-44.04327-(16.44368)));
            yy = 5.427 + (((tickAnim - 25) / 5) * (8.48742-(5.427)));
            zz = 24.3455 + (((tickAnim - 25) / 5) * (20.72898-(24.3455)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -44.04327 + (((tickAnim - 30) / 6) * (-65.86138-(-44.04327)));
            yy = 8.48742 + (((tickAnim - 30) / 6) * (12.0579-(8.48742)));
            zz = 20.72898 + (((tickAnim - 30) / 6) * (16.5097-(20.72898)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle5c, tentacle5c.rotateAngleX + (float) Math.toRadians(xx), tentacle5c.rotateAngleY + (float) Math.toRadians(yy), tentacle5c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 52.53398 + (((tickAnim - 0) / 5) * (72.53398-(52.53398)));
            yy = -2.49985 + (((tickAnim - 0) / 5) * (-2.49985-(-2.49985)));
            zz = 0.04349 + (((tickAnim - 0) / 5) * (0.04349-(0.04349)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 72.53398 + (((tickAnim - 5) / 10) * (65.03358-(72.53398)));
            yy = -2.49985 + (((tickAnim - 5) / 10) * (-3.52108-(-2.49985)));
            zz = 0.04349 + (((tickAnim - 5) / 10) * (-6.26219-(0.04349)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 65.03358 + (((tickAnim - 15) / 10) * (-39.96602-(65.03358)));
            yy = -3.52108 + (((tickAnim - 15) / 10) * (-2.49985-(-3.52108)));
            zz = -6.26219 + (((tickAnim - 15) / 10) * (0.04349-(-6.26219)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -39.96602 + (((tickAnim - 25) / 11) * (52.53398-(-39.96602)));
            yy = -2.49985 + (((tickAnim - 25) / 11) * (-2.49985-(-2.49985)));
            zz = 0.04349 + (((tickAnim - 25) / 11) * (0.04349-(0.04349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle10a, tentacle10a.rotateAngleX + (float) Math.toRadians(xx), tentacle10a.rotateAngleY + (float) Math.toRadians(yy), tentacle10a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -47.5 + (((tickAnim - 0) / 5) * (-27.81081-(-47.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (-16.97745-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (29.23553-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -27.81081 + (((tickAnim - 5) / 10) * (-27.81081-(-27.81081)));
            yy = -16.97745 + (((tickAnim - 5) / 10) * (-16.97745-(-16.97745)));
            zz = 29.23553 + (((tickAnim - 5) / 10) * (29.23553-(29.23553)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -27.81081 + (((tickAnim - 15) / 5) * (18.49346-(-27.81081)));
            yy = -16.97745 + (((tickAnim - 15) / 5) * (-13.43027-(-16.97745)));
            zz = 29.23553 + (((tickAnim - 15) / 5) * (13.84782-(29.23553)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 18.49346 + (((tickAnim - 20) / 5) * (19.79774-(18.49346)));
            yy = -13.43027 + (((tickAnim - 20) / 5) * (-9.88309-(-13.43027)));
            zz = 13.84782 + (((tickAnim - 20) / 5) * (-1.53989-(13.84782)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 19.79774 + (((tickAnim - 25) / 5) * (-26.26275-(19.79774)));
            yy = -9.88309 + (((tickAnim - 25) / 5) * (-5.32166-(-9.88309)));
            zz = -1.53989 + (((tickAnim - 25) / 5) * (-0.82917-(-1.53989)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -26.26275 + (((tickAnim - 30) / 3) * (-47.86443-(-26.26275)));
            yy = -5.32166 + (((tickAnim - 30) / 3) * (-3.04095-(-5.32166)));
            zz = -0.82917 + (((tickAnim - 30) / 3) * (-0.47381-(-0.82917)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -47.86443 + (((tickAnim - 33) / 3) * (-47.5-(-47.86443)));
            yy = -3.04095 + (((tickAnim - 33) / 3) * (0-(-3.04095)));
            zz = -0.47381 + (((tickAnim - 33) / 3) * (0-(-0.47381)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle10b, tentacle10b.rotateAngleX + (float) Math.toRadians(xx), tentacle10b.rotateAngleY + (float) Math.toRadians(yy), tentacle10b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -65.86138 + (((tickAnim - 0) / 5) * (1.054-(-65.86138)));
            yy = -12.05787 + (((tickAnim - 0) / 5) * (-19.29394-(-12.05787)));
            zz = -16.50969 + (((tickAnim - 0) / 5) * (-8.94622-(-16.50969)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 1.054 + (((tickAnim - 5) / 10) * (-13.946-(1.054)));
            yy = -19.29394 + (((tickAnim - 5) / 10) * (-19.29394-(-19.29394)));
            zz = -8.94622 + (((tickAnim - 5) / 10) * (-8.94622-(-8.94622)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -13.946 + (((tickAnim - 15) / 5) * (23.74884-(-13.946)));
            yy = -19.29394 + (((tickAnim - 15) / 5) * (-12.36045-(-19.29394)));
            zz = -8.94622 + (((tickAnim - 15) / 5) * (-16.64584-(-8.94622)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 23.74884 + (((tickAnim - 20) / 5) * (16.44368-(23.74884)));
            yy = -12.36045 + (((tickAnim - 20) / 5) * (-5.42696-(-12.36045)));
            zz = -16.64584 + (((tickAnim - 20) / 5) * (-24.34547-(-16.64584)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 16.44368 + (((tickAnim - 25) / 5) * (-44.04327-(16.44368)));
            yy = -5.42696 + (((tickAnim - 25) / 5) * (-8.48738-(-5.42696)));
            zz = -24.34547 + (((tickAnim - 25) / 5) * (-20.72895-(-24.34547)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -44.04327 + (((tickAnim - 30) / 6) * (-65.86138-(-44.04327)));
            yy = -8.48738 + (((tickAnim - 30) / 6) * (-12.05787-(-8.48738)));
            zz = -20.72895 + (((tickAnim - 30) / 6) * (-16.50969-(-20.72895)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle10c, tentacle10c.rotateAngleX + (float) Math.toRadians(xx), tentacle10c.rotateAngleY + (float) Math.toRadians(yy), tentacle10c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 62.56359 + (((tickAnim - 0) / 5) * (72.56359-(62.56359)));
            yy = 0.9809 + (((tickAnim - 0) / 5) * (0.9809-(0.9809)));
            zz = -9.0117 + (((tickAnim - 0) / 5) * (-9.0117-(-9.0117)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 72.56359 + (((tickAnim - 5) / 10) * (63.53986-(72.56359)));
            yy = 0.9809 + (((tickAnim - 5) / 10) * (0.7707-(0.9809)));
            zz = -9.0117 + (((tickAnim - 5) / 10) * (-0.8812-(-9.0117)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 63.53986 + (((tickAnim - 15) / 10) * (-40.87135-(63.53986)));
            yy = 0.7707 + (((tickAnim - 15) / 10) * (-8.3462-(0.7707)));
            zz = -0.8812 + (((tickAnim - 15) / 10) * (3.913-(-0.8812)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -40.87135 + (((tickAnim - 25) / 11) * (62.56359-(-40.87135)));
            yy = -8.3462 + (((tickAnim - 25) / 11) * (0.9809-(-8.3462)));
            zz = 3.913 + (((tickAnim - 25) / 11) * (-9.0117-(3.913)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle4a, tentacle4a.rotateAngleX + (float) Math.toRadians(xx), tentacle4a.rotateAngleY + (float) Math.toRadians(yy), tentacle4a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -54.34296 + (((tickAnim - 0) / 5) * (-19.54259-(-54.34296)));
            yy = 7.07 + (((tickAnim - 0) / 5) * (8.2182-(7.07)));
            zz = 16.3246 + (((tickAnim - 0) / 5) * (6.0312-(16.3246)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -19.54259 + (((tickAnim - 5) / 10) * (-22.09017-(-19.54259)));
            yy = 8.2182 + (((tickAnim - 5) / 10) * (9.1498-(8.2182)));
            zz = 6.0312 + (((tickAnim - 5) / 10) * (9.5805-(6.0312)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -22.09017 + (((tickAnim - 15) / 5) * (17.45359-(-22.09017)));
            yy = 9.1498 + (((tickAnim - 15) / 5) * (1.2615-(9.1498)));
            zz = 9.5805 + (((tickAnim - 15) / 5) * (14.65905-(9.5805)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 17.45359 + (((tickAnim - 20) / 5) * (11.99736-(17.45359)));
            yy = 1.2615 + (((tickAnim - 20) / 5) * (-6.6268-(1.2615)));
            zz = 14.65905 + (((tickAnim - 20) / 5) * (19.7376-(14.65905)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 11.99736 + (((tickAnim - 25) / 8) * (-58.93056-(11.99736)));
            yy = -6.6268 + (((tickAnim - 25) / 8) * (2.8556-(-6.6268)));
            zz = 19.7376 + (((tickAnim - 25) / 8) * (17.37475-(19.7376)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -58.93056 + (((tickAnim - 33) / 3) * (-54.34296-(-58.93056)));
            yy = 2.8556 + (((tickAnim - 33) / 3) * (7.07-(2.8556)));
            zz = 17.37475 + (((tickAnim - 33) / 3) * (16.3246-(17.37475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle4b, tentacle4b.rotateAngleX + (float) Math.toRadians(xx), tentacle4b.rotateAngleY + (float) Math.toRadians(yy), tentacle4b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -58.11534 + (((tickAnim - 0) / 5) * (2.76881-(-58.11534)));
            yy = -3.2009 + (((tickAnim - 0) / 5) * (-0.1307-(-3.2009)));
            zz = -14.7764 + (((tickAnim - 0) / 5) * (-21.6769-(-14.7764)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 2.76881 + (((tickAnim - 5) / 10) * (-2.69005-(2.76881)));
            yy = -0.1307 + (((tickAnim - 5) / 10) * (1.1449-(-0.1307)));
            zz = -21.6769 + (((tickAnim - 5) / 10) * (-16.1751-(-21.6769)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.69005 + (((tickAnim - 15) / 5) * (25.71938-(-2.69005)));
            yy = 1.1449 + (((tickAnim - 15) / 5) * (1.21805-(1.1449)));
            zz = -16.1751 + (((tickAnim - 15) / 5) * (-14.37025-(-16.1751)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 25.71938 + (((tickAnim - 20) / 5) * (9.1288-(25.71938)));
            yy = 1.21805 + (((tickAnim - 20) / 5) * (1.2912-(1.21805)));
            zz = -14.37025 + (((tickAnim - 20) / 5) * (-12.5654-(-14.37025)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 9.1288 + (((tickAnim - 25) / 5) * (-44.40696-(9.1288)));
            yy = 1.2912 + (((tickAnim - 25) / 5) * (-0.78208-(1.2912)));
            zz = -12.5654 + (((tickAnim - 25) / 5) * (-13.58586-(-12.5654)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -44.40696 + (((tickAnim - 30) / 6) * (-58.11534-(-44.40696)));
            yy = -0.78208 + (((tickAnim - 30) / 6) * (-3.2009-(-0.78208)));
            zz = -13.58586 + (((tickAnim - 30) / 6) * (-14.7764-(-13.58586)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle4c, tentacle4c.rotateAngleX + (float) Math.toRadians(xx), tentacle4c.rotateAngleY + (float) Math.toRadians(yy), tentacle4c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 62.56359 + (((tickAnim - 0) / 5) * (72.56359-(62.56359)));
            yy = -0.98091 + (((tickAnim - 0) / 5) * (-0.98091-(-0.98091)));
            zz = 9.01174 + (((tickAnim - 0) / 5) * (9.01174-(9.01174)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 72.56359 + (((tickAnim - 5) / 10) * (63.53986-(72.56359)));
            yy = -0.98091 + (((tickAnim - 5) / 10) * (-0.77065-(-0.98091)));
            zz = 9.01174 + (((tickAnim - 5) / 10) * (0.8812-(9.01174)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 63.53986 + (((tickAnim - 15) / 10) * (-40.87135-(63.53986)));
            yy = -0.77065 + (((tickAnim - 15) / 10) * (8.34618-(-0.77065)));
            zz = 0.8812 + (((tickAnim - 15) / 10) * (-3.91295-(0.8812)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -40.87135 + (((tickAnim - 25) / 11) * (62.56359-(-40.87135)));
            yy = 8.34618 + (((tickAnim - 25) / 11) * (-0.98091-(8.34618)));
            zz = -3.91295 + (((tickAnim - 25) / 11) * (9.01174-(-3.91295)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle9a, tentacle9a.rotateAngleX + (float) Math.toRadians(xx), tentacle9a.rotateAngleY + (float) Math.toRadians(yy), tentacle9a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -54.34296 + (((tickAnim - 0) / 5) * (-19.54259-(-54.34296)));
            yy = -7.06997 + (((tickAnim - 0) / 5) * (-8.21818-(-7.06997)));
            zz = -16.32463 + (((tickAnim - 0) / 5) * (-6.0312-(-16.32463)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -19.54259 + (((tickAnim - 5) / 10) * (-22.09017-(-19.54259)));
            yy = -8.21818 + (((tickAnim - 5) / 10) * (-9.14983-(-8.21818)));
            zz = -6.0312 + (((tickAnim - 5) / 10) * (-9.58048-(-6.0312)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -22.09017 + (((tickAnim - 15) / 5) * (17.45359-(-22.09017)));
            yy = -9.14983 + (((tickAnim - 15) / 5) * (-1.26152-(-9.14983)));
            zz = -9.58048 + (((tickAnim - 15) / 5) * (-14.65903-(-9.58048)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 17.45359 + (((tickAnim - 20) / 5) * (11.99736-(17.45359)));
            yy = -1.26152 + (((tickAnim - 20) / 5) * (6.62679-(-1.26152)));
            zz = -14.65903 + (((tickAnim - 20) / 5) * (-19.73758-(-14.65903)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 11.99736 + (((tickAnim - 25) / 8) * (-51.43056-(11.99736)));
            yy = 6.62679 + (((tickAnim - 25) / 8) * (-2.85558-(6.62679)));
            zz = -19.73758 + (((tickAnim - 25) / 8) * (-17.37477-(-19.73758)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -51.43056 + (((tickAnim - 33) / 3) * (-54.34296-(-51.43056)));
            yy = -2.85558 + (((tickAnim - 33) / 3) * (-7.06997-(-2.85558)));
            zz = -17.37477 + (((tickAnim - 33) / 3) * (-16.32463-(-17.37477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle9b, tentacle9b.rotateAngleX + (float) Math.toRadians(xx), tentacle9b.rotateAngleY + (float) Math.toRadians(yy), tentacle9b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -58.11534 + (((tickAnim - 0) / 5) * (2.76881-(-58.11534)));
            yy = 3.20091 + (((tickAnim - 0) / 5) * (0.13074-(3.20091)));
            zz = 14.77642 + (((tickAnim - 0) / 5) * (21.67686-(14.77642)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 2.76881 + (((tickAnim - 5) / 10) * (-2.69005-(2.76881)));
            yy = 0.13074 + (((tickAnim - 5) / 10) * (-1.14492-(0.13074)));
            zz = 21.67686 + (((tickAnim - 5) / 10) * (16.17514-(21.67686)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.69005 + (((tickAnim - 15) / 5) * (25.71938-(-2.69005)));
            yy = -1.14492 + (((tickAnim - 15) / 5) * (-1.21806-(-1.14492)));
            zz = 16.17514 + (((tickAnim - 15) / 5) * (14.37025-(16.17514)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 25.71938 + (((tickAnim - 20) / 5) * (9.1288-(25.71938)));
            yy = -1.21806 + (((tickAnim - 20) / 5) * (-1.2912-(-1.21806)));
            zz = 14.37025 + (((tickAnim - 20) / 5) * (12.56535-(14.37025)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 9.1288 + (((tickAnim - 25) / 5) * (-44.40696-(9.1288)));
            yy = -1.2912 + (((tickAnim - 25) / 5) * (0.78208-(-1.2912)));
            zz = 12.56535 + (((tickAnim - 25) / 5) * (13.58585-(12.56535)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -44.40696 + (((tickAnim - 30) / 6) * (-58.11534-(-44.40696)));
            yy = 0.78208 + (((tickAnim - 30) / 6) * (3.20091-(0.78208)));
            zz = 13.58585 + (((tickAnim - 30) / 6) * (14.77642-(13.58585)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle9c, tentacle9c.rotateAngleX + (float) Math.toRadians(xx), tentacle9c.rotateAngleY + (float) Math.toRadians(yy), tentacle9c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 0) / 5) * (4.52132-(-10)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.8703-(0)));
            zz = 42.5 + (((tickAnim - 0) / 5) * (61.6533-(42.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 4.52132 + (((tickAnim - 5) / 10) * (-12.3954-(4.52132)));
            yy = -7.8703 + (((tickAnim - 5) / 10) * (-1.4955-(-7.8703)));
            zz = 61.6533 + (((tickAnim - 5) / 10) * (68.7092-(61.6533)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -12.3954 + (((tickAnim - 15) / 10) * (-0.05108-(-12.3954)));
            yy = -1.4955 + (((tickAnim - 15) / 10) * (11.5469-(-1.4955)));
            zz = 68.7092 + (((tickAnim - 15) / 10) * (-32.3038-(68.7092)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -0.05108 + (((tickAnim - 25) / 11) * (-10-(-0.05108)));
            yy = 11.5469 + (((tickAnim - 25) / 11) * (0-(11.5469)));
            zz = -32.3038 + (((tickAnim - 25) / 11) * (42.5-(-32.3038)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle3a, tentacle3a.rotateAngleX + (float) Math.toRadians(xx), tentacle3a.rotateAngleY + (float) Math.toRadians(yy), tentacle3a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 0) / 5) * (30-(12.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -37.5 + (((tickAnim - 0) / 5) * (-37.5-(-37.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 30 + (((tickAnim - 5) / 10) * (30-(30)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = -37.5 + (((tickAnim - 5) / 10) * (-37.5-(-37.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 30 + (((tickAnim - 15) / 5) * (25.23728-(30)));
            yy = 0 + (((tickAnim - 15) / 5) * (-5.22573-(0)));
            zz = -37.5 + (((tickAnim - 15) / 5) * (13.59312-(-37.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 25.23728 + (((tickAnim - 20) / 5) * (19.66363-(25.23728)));
            yy = -5.22573 + (((tickAnim - 20) / 5) * (-5.7646-(-5.22573)));
            zz = 13.59312 + (((tickAnim - 20) / 5) * (19.9206-(13.59312)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 19.66363 + (((tickAnim - 25) / 8) * (13.84308-(19.66363)));
            yy = -5.7646 + (((tickAnim - 25) / 8) * (-3.48517-(-5.7646)));
            zz = 19.9206 + (((tickAnim - 25) / 8) * (-39.77791-(19.9206)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 13.84308 + (((tickAnim - 33) / 3) * (12.5-(13.84308)));
            yy = -3.48517 + (((tickAnim - 33) / 3) * (0-(-3.48517)));
            zz = -39.77791 + (((tickAnim - 33) / 3) * (-37.5-(-39.77791)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle3b, tentacle3b.rotateAngleX + (float) Math.toRadians(xx), tentacle3b.rotateAngleY + (float) Math.toRadians(yy), tentacle3b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -25 + (((tickAnim - 0) / 5) * (10.20749-(-25)));
            yy = 0 + (((tickAnim - 0) / 5) * (5.2203-(0)));
            zz = -65 + (((tickAnim - 0) / 5) * (-25.9955-(-65)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 10.20749 + (((tickAnim - 5) / 10) * (0.53585-(10.20749)));
            yy = 5.2203 + (((tickAnim - 5) / 10) * (6.9309-(5.2203)));
            zz = -25.9955 + (((tickAnim - 5) / 10) * (-24.8765-(-25.9955)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.53585 + (((tickAnim - 15) / 5) * (-5.10385-(0.53585)));
            yy = 6.9309 + (((tickAnim - 15) / 5) * (1.96391-(6.9309)));
            zz = -24.8765 + (((tickAnim - 15) / 5) * (12.43298-(-24.8765)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -5.10385 + (((tickAnim - 20) / 5) * (-13.35553-(-5.10385)));
            yy = 1.96391 + (((tickAnim - 20) / 5) * (2.3491-(1.96391)));
            zz = 12.43298 + (((tickAnim - 20) / 5) * (4.9825-(12.43298)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -13.35553 + (((tickAnim - 25) / 11) * (-25-(-13.35553)));
            yy = 2.3491 + (((tickAnim - 25) / 11) * (0-(2.3491)));
            zz = 4.9825 + (((tickAnim - 25) / 11) * (-65-(4.9825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle3c, tentacle3c.rotateAngleX + (float) Math.toRadians(xx), tentacle3c.rotateAngleY + (float) Math.toRadians(yy), tentacle3c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 0) / 5) * (4.52132-(-10)));
            yy = 0 + (((tickAnim - 0) / 5) * (7.8703-(0)));
            zz = -42.5 + (((tickAnim - 0) / 5) * (-61.65331-(-42.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 4.52132 + (((tickAnim - 5) / 10) * (-12.3954-(4.52132)));
            yy = 7.8703 + (((tickAnim - 5) / 10) * (1.49553-(7.8703)));
            zz = -61.65331 + (((tickAnim - 5) / 10) * (-68.70919-(-61.65331)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -12.3954 + (((tickAnim - 15) / 10) * (-0.05108-(-12.3954)));
            yy = 1.49553 + (((tickAnim - 15) / 10) * (-11.54688-(1.49553)));
            zz = -68.70919 + (((tickAnim - 15) / 10) * (32.30375-(-68.70919)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -0.05108 + (((tickAnim - 25) / 11) * (-10-(-0.05108)));
            yy = -11.54688 + (((tickAnim - 25) / 11) * (0-(-11.54688)));
            zz = 32.30375 + (((tickAnim - 25) / 11) * (-42.5-(32.30375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle8a, tentacle8a.rotateAngleX + (float) Math.toRadians(xx), tentacle8a.rotateAngleY + (float) Math.toRadians(yy), tentacle8a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 0) / 5) * (30-(12.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 37.5 + (((tickAnim - 0) / 5) * (37.5-(37.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 30 + (((tickAnim - 5) / 10) * (30-(30)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 37.5 + (((tickAnim - 5) / 10) * (37.5-(37.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 30 + (((tickAnim - 15) / 5) * (25.23728-(30)));
            yy = 0 + (((tickAnim - 15) / 5) * (5.22574-(0)));
            zz = 37.5 + (((tickAnim - 15) / 5) * (-13.59314-(37.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 25.23728 + (((tickAnim - 20) / 5) * (19.66363-(25.23728)));
            yy = 5.22574 + (((tickAnim - 20) / 5) * (5.76461-(5.22574)));
            zz = -13.59314 + (((tickAnim - 20) / 5) * (-19.92064-(-13.59314)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 19.66363 + (((tickAnim - 25) / 8) * (14.09533-(19.66363)));
            yy = 5.76461 + (((tickAnim - 25) / 8) * (2.80922-(5.76461)));
            zz = -19.92064 + (((tickAnim - 25) / 8) * (32.30413-(-19.92064)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 14.09533 + (((tickAnim - 33) / 3) * (12.5-(14.09533)));
            yy = 2.80922 + (((tickAnim - 33) / 3) * (0-(2.80922)));
            zz = 32.30413 + (((tickAnim - 33) / 3) * (37.5-(32.30413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle8b, tentacle8b.rotateAngleX + (float) Math.toRadians(xx), tentacle8b.rotateAngleY + (float) Math.toRadians(yy), tentacle8b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -25 + (((tickAnim - 0) / 5) * (10.20749-(-25)));
            yy = 0 + (((tickAnim - 0) / 5) * (-5.22033-(0)));
            zz = 65 + (((tickAnim - 0) / 5) * (25.99551-(65)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 10.20749 + (((tickAnim - 5) / 10) * (0.53585-(10.20749)));
            yy = -5.22033 + (((tickAnim - 5) / 10) * (-6.93088-(-5.22033)));
            zz = 25.99551 + (((tickAnim - 5) / 10) * (24.87646-(25.99551)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.53585 + (((tickAnim - 15) / 5) * (-5.10385-(0.53585)));
            yy = -6.93088 + (((tickAnim - 15) / 5) * (-1.96392-(-6.93088)));
            zz = 24.87646 + (((tickAnim - 15) / 5) * (-12.43298-(24.87646)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -5.10385 + (((tickAnim - 20) / 5) * (-13.35553-(-5.10385)));
            yy = -1.96392 + (((tickAnim - 20) / 5) * (-2.34914-(-1.96392)));
            zz = -12.43298 + (((tickAnim - 20) / 5) * (-4.98246-(-12.43298)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -13.35553 + (((tickAnim - 25) / 11) * (-25-(-13.35553)));
            yy = -2.34914 + (((tickAnim - 25) / 11) * (0-(-2.34914)));
            zz = -4.98246 + (((tickAnim - 25) / 11) * (65-(-4.98246)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle8c, tentacle8c.rotateAngleX + (float) Math.toRadians(xx), tentacle8c.rotateAngleY + (float) Math.toRadians(yy), tentacle8c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.22766 + (((tickAnim - 0) / 5) * (-6.70548-(-20.22766)));
            yy = -3.4398 + (((tickAnim - 0) / 5) * (-8.9064-(-3.4398)));
            zz = 17.4908 + (((tickAnim - 0) / 5) * (49.7576-(17.4908)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -6.70548 + (((tickAnim - 5) / 10) * (-40.04374-(-6.70548)));
            yy = -8.9064 + (((tickAnim - 5) / 10) * (5.1489-(-8.9064)));
            zz = 49.7576 + (((tickAnim - 5) / 10) * (19.5935-(49.7576)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -40.04374 + (((tickAnim - 15) / 10) * (39.77234-(-40.04374)));
            yy = 5.1489 + (((tickAnim - 15) / 10) * (-3.4398-(5.1489)));
            zz = 19.5935 + (((tickAnim - 15) / 10) * (17.4908-(19.5935)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 39.77234 + (((tickAnim - 25) / 11) * (-20.22766-(39.77234)));
            yy = -3.4398 + (((tickAnim - 25) / 11) * (-3.4398-(-3.4398)));
            zz = 17.4908 + (((tickAnim - 25) / 11) * (17.4908-(17.4908)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle2a, tentacle2a.rotateAngleX + (float) Math.toRadians(xx), tentacle2a.rotateAngleY + (float) Math.toRadians(yy), tentacle2a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 33.75767 + (((tickAnim - 0) / 5) * (33.54309-(33.75767)));
            yy = 1.8637 + (((tickAnim - 0) / 5) * (-1.1335-(1.8637)));
            zz = -22.7299 + (((tickAnim - 0) / 5) * (-7.855-(-22.7299)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 33.54309 + (((tickAnim - 5) / 10) * (32.85089-(33.54309)));
            yy = -1.1335 + (((tickAnim - 5) / 10) * (-0.3314-(-1.1335)));
            zz = -7.855 + (((tickAnim - 5) / 10) * (-10.214-(-7.855)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 32.85089 + (((tickAnim - 15) / 5) * (-11.59661-(32.85089)));
            yy = -0.3314 + (((tickAnim - 15) / 5) * (-4.1236-(-0.3314)));
            zz = -10.214 + (((tickAnim - 15) / 5) * (-15.4218-(-10.214)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -11.59661 + (((tickAnim - 20) / 5) * (-11.04411-(-11.59661)));
            yy = -4.1236 + (((tickAnim - 20) / 5) * (-7.9158-(-4.1236)));
            zz = -15.4218 + (((tickAnim - 20) / 5) * (-20.6296-(-15.4218)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -11.04411 + (((tickAnim - 25) / 11) * (33.75767-(-11.04411)));
            yy = -7.9158 + (((tickAnim - 25) / 11) * (1.8637-(-7.9158)));
            zz = -20.6296 + (((tickAnim - 25) / 11) * (-22.7299-(-20.6296)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle2b, tentacle2b.rotateAngleX + (float) Math.toRadians(xx), tentacle2b.rotateAngleY + (float) Math.toRadians(yy), tentacle2b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 55 + (((tickAnim - 0) / 5) * (35-(55)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 27.5 + (((tickAnim - 0) / 5) * (27.5-(27.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 35 + (((tickAnim - 5) / 10) * (34.31439-(35)));
            yy = 0 + (((tickAnim - 5) / 10) * (0.6602-(0)));
            zz = 27.5 + (((tickAnim - 5) / 10) * (22.6856-(27.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 34.31439 + (((tickAnim - 15) / 5) * (-12.38309-(34.31439)));
            yy = 0.6602 + (((tickAnim - 15) / 5) * (4.69065-(0.6602)));
            zz = 22.6856 + (((tickAnim - 15) / 5) * (20.4311-(22.6856)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -12.38309 + (((tickAnim - 20) / 5) * (-14.08057-(-12.38309)));
            yy = 4.69065 + (((tickAnim - 20) / 5) * (8.7211-(4.69065)));
            zz = 20.4311 + (((tickAnim - 20) / 5) * (18.1766-(20.4311)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -14.08057 + (((tickAnim - 25) / 11) * (55-(-14.08057)));
            yy = 8.7211 + (((tickAnim - 25) / 11) * (0-(8.7211)));
            zz = 18.1766 + (((tickAnim - 25) / 11) * (27.5-(18.1766)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle2c, tentacle2c.rotateAngleX + (float) Math.toRadians(xx), tentacle2c.rotateAngleY + (float) Math.toRadians(yy), tentacle2c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.22766 + (((tickAnim - 0) / 5) * (-6.70548-(-20.22766)));
            yy = 3.43978 + (((tickAnim - 0) / 5) * (8.90644-(3.43978)));
            zz = -17.49077 + (((tickAnim - 0) / 5) * (-49.75763-(-17.49077)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -6.70548 + (((tickAnim - 5) / 10) * (-40.04374-(-6.70548)));
            yy = 8.90644 + (((tickAnim - 5) / 10) * (-5.14895-(8.90644)));
            zz = -49.75763 + (((tickAnim - 5) / 10) * (-19.59352-(-49.75763)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -40.04374 + (((tickAnim - 15) / 10) * (39.77234-(-40.04374)));
            yy = -5.14895 + (((tickAnim - 15) / 10) * (3.43978-(-5.14895)));
            zz = -19.59352 + (((tickAnim - 15) / 10) * (-17.49077-(-19.59352)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 39.77234 + (((tickAnim - 25) / 11) * (-20.22766-(39.77234)));
            yy = 3.43978 + (((tickAnim - 25) / 11) * (3.43978-(3.43978)));
            zz = -17.49077 + (((tickAnim - 25) / 11) * (-17.49077-(-17.49077)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle7a, tentacle7a.rotateAngleX + (float) Math.toRadians(xx), tentacle7a.rotateAngleY + (float) Math.toRadians(yy), tentacle7a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 33.75767 + (((tickAnim - 0) / 5) * (33.54309-(33.75767)));
            yy = -1.86368 + (((tickAnim - 0) / 5) * (1.13347-(-1.86368)));
            zz = 22.72987 + (((tickAnim - 0) / 5) * (7.85503-(22.72987)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 33.54309 + (((tickAnim - 5) / 10) * (32.85089-(33.54309)));
            yy = 1.13347 + (((tickAnim - 5) / 10) * (0.33137-(1.13347)));
            zz = 7.85503 + (((tickAnim - 5) / 10) * (10.21397-(7.85503)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 32.85089 + (((tickAnim - 15) / 5) * (-11.59661-(32.85089)));
            yy = 0.33137 + (((tickAnim - 15) / 5) * (4.1236-(0.33137)));
            zz = 10.21397 + (((tickAnim - 15) / 5) * (15.42179-(10.21397)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -11.59661 + (((tickAnim - 20) / 5) * (-11.04411-(-11.59661)));
            yy = 4.1236 + (((tickAnim - 20) / 5) * (7.91583-(4.1236)));
            zz = 15.42179 + (((tickAnim - 20) / 5) * (20.62961-(15.42179)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -11.04411 + (((tickAnim - 25) / 11) * (33.75767-(-11.04411)));
            yy = 7.91583 + (((tickAnim - 25) / 11) * (-1.86368-(7.91583)));
            zz = 20.62961 + (((tickAnim - 25) / 11) * (22.72987-(20.62961)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle7b, tentacle7b.rotateAngleX + (float) Math.toRadians(xx), tentacle7b.rotateAngleY + (float) Math.toRadians(yy), tentacle7b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 55 + (((tickAnim - 0) / 5) * (35-(55)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -27.5 + (((tickAnim - 0) / 5) * (-27.5-(-27.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 35 + (((tickAnim - 5) / 10) * (34.31439-(35)));
            yy = 0 + (((tickAnim - 5) / 10) * (-0.66025-(0)));
            zz = -27.5 + (((tickAnim - 5) / 10) * (-22.68565-(-27.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 34.31439 + (((tickAnim - 15) / 5) * (-12.38309-(34.31439)));
            yy = -0.66025 + (((tickAnim - 15) / 5) * (-4.69066-(-0.66025)));
            zz = -22.68565 + (((tickAnim - 15) / 5) * (-20.43111-(-22.68565)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -12.38309 + (((tickAnim - 20) / 5) * (-14.08057-(-12.38309)));
            yy = -4.69066 + (((tickAnim - 20) / 5) * (-8.72107-(-4.69066)));
            zz = -20.43111 + (((tickAnim - 20) / 5) * (-18.17657-(-20.43111)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -14.08057 + (((tickAnim - 25) / 11) * (55-(-14.08057)));
            yy = -8.72107 + (((tickAnim - 25) / 11) * (0-(-8.72107)));
            zz = -18.17657 + (((tickAnim - 25) / 11) * (-27.5-(-18.17657)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle7c, tentacle7c.rotateAngleX + (float) Math.toRadians(xx), tentacle7c.rotateAngleY + (float) Math.toRadians(yy), tentacle7c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -17.5 + (((tickAnim - 0) / 5) * (-35-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -35 + (((tickAnim - 5) / 10) * (-47.5-(-35)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -47.5 + (((tickAnim - 15) / 10) * (17.5-(-47.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 17.5 + (((tickAnim - 25) / 11) * (-17.5-(17.5)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle1a, tentacle1a.rotateAngleX + (float) Math.toRadians(xx), tentacle1a.rotateAngleY + (float) Math.toRadians(yy), tentacle1a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -7.41643 + (((tickAnim - 0) / 5) * (27.78504-(-7.41643)));
            yy = 2.1109 + (((tickAnim - 0) / 5) * (-0.5561-(2.1109)));
            zz = 4.5336 + (((tickAnim - 0) / 5) * (19.2973-(4.5336)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 27.78504 + (((tickAnim - 5) / 10) * (27.78504-(27.78504)));
            yy = -0.5561 + (((tickAnim - 5) / 10) * (-0.5561-(-0.5561)));
            zz = 19.2973 + (((tickAnim - 5) / 10) * (19.2973-(19.2973)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 27.78504 + (((tickAnim - 15) / 5) * (-12.3157-(27.78504)));
            yy = -0.5561 + (((tickAnim - 15) / 5) * (0.7774-(-0.5561)));
            zz = 19.2973 + (((tickAnim - 15) / 5) * (11.91545-(19.2973)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -12.3157 + (((tickAnim - 20) / 5) * (-7.41643-(-12.3157)));
            yy = 0.7774 + (((tickAnim - 20) / 5) * (2.1109-(0.7774)));
            zz = 11.91545 + (((tickAnim - 20) / 5) * (4.5336-(11.91545)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -7.41643 + (((tickAnim - 25) / 11) * (-7.41643-(-7.41643)));
            yy = 2.1109 + (((tickAnim - 25) / 11) * (2.1109-(2.1109)));
            zz = 4.5336 + (((tickAnim - 25) / 11) * (4.5336-(4.5336)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle1b, tentacle1b.rotateAngleX + (float) Math.toRadians(xx), tentacle1b.rotateAngleY + (float) Math.toRadians(yy), tentacle1b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 74.2003 + (((tickAnim - 0) / 5) * (53.79402-(74.2003)));
            yy = 8.4369 + (((tickAnim - 0) / 5) * (8.7301-(8.4369)));
            zz = -9.2661 + (((tickAnim - 0) / 5) * (-11.7819-(-9.2661)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 53.79402 + (((tickAnim - 5) / 10) * (55.13262-(53.79402)));
            yy = 8.7301 + (((tickAnim - 5) / 10) * (5.7661-(8.7301)));
            zz = -11.7819 + (((tickAnim - 5) / 10) * (-2.137-(-11.7819)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 55.13262 + (((tickAnim - 15) / 5) * (4.66646-(55.13262)));
            yy = 5.7661 + (((tickAnim - 15) / 5) * (7.1015-(5.7661)));
            zz = -2.137 + (((tickAnim - 15) / 5) * (-5.70155-(-2.137)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 4.66646 + (((tickAnim - 20) / 5) * (-0.7997-(4.66646)));
            yy = 7.1015 + (((tickAnim - 20) / 5) * (8.4369-(7.1015)));
            zz = -5.70155 + (((tickAnim - 20) / 5) * (-9.2661-(-5.70155)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -0.7997 + (((tickAnim - 25) / 11) * (74.2003-(-0.7997)));
            yy = 8.4369 + (((tickAnim - 25) / 11) * (8.4369-(8.4369)));
            zz = -9.2661 + (((tickAnim - 25) / 11) * (-9.2661-(-9.2661)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle1c, tentacle1c.rotateAngleX + (float) Math.toRadians(xx), tentacle1c.rotateAngleY + (float) Math.toRadians(yy), tentacle1c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -17.5 + (((tickAnim - 0) / 5) * (-35-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -35 + (((tickAnim - 5) / 10) * (-47.5-(-35)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -47.5 + (((tickAnim - 15) / 10) * (17.5-(-47.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 17.5 + (((tickAnim - 25) / 11) * (-17.5-(17.5)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle6a, tentacle6a.rotateAngleX + (float) Math.toRadians(xx), tentacle6a.rotateAngleY + (float) Math.toRadians(yy), tentacle6a.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -7.41643 + (((tickAnim - 0) / 5) * (27.78504-(-7.41643)));
            yy = -2.11089 + (((tickAnim - 0) / 5) * (0.55611-(-2.11089)));
            zz = -4.53359 + (((tickAnim - 0) / 5) * (-19.29729-(-4.53359)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 27.78504 + (((tickAnim - 5) / 10) * (27.78504-(27.78504)));
            yy = 0.55611 + (((tickAnim - 5) / 10) * (0.55611-(0.55611)));
            zz = -19.29729 + (((tickAnim - 5) / 10) * (-19.29729-(-19.29729)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 27.78504 + (((tickAnim - 15) / 5) * (-12.3157-(27.78504)));
            yy = 0.55611 + (((tickAnim - 15) / 5) * (-0.77739-(0.55611)));
            zz = -19.29729 + (((tickAnim - 15) / 5) * (-11.91544-(-19.29729)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -12.3157 + (((tickAnim - 20) / 5) * (-7.41643-(-12.3157)));
            yy = -0.77739 + (((tickAnim - 20) / 5) * (-2.11089-(-0.77739)));
            zz = -11.91544 + (((tickAnim - 20) / 5) * (-4.53359-(-11.91544)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -7.41643 + (((tickAnim - 25) / 11) * (-7.41643-(-7.41643)));
            yy = -2.11089 + (((tickAnim - 25) / 11) * (-2.11089-(-2.11089)));
            zz = -4.53359 + (((tickAnim - 25) / 11) * (-4.53359-(-4.53359)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle6b, tentacle6b.rotateAngleX + (float) Math.toRadians(xx), tentacle6b.rotateAngleY + (float) Math.toRadians(yy), tentacle6b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 74.2003 + (((tickAnim - 0) / 5) * (53.79402-(74.2003)));
            yy = -8.43694 + (((tickAnim - 0) / 5) * (-8.73009-(-8.43694)));
            zz = 9.26609 + (((tickAnim - 0) / 5) * (11.78186-(9.26609)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 53.79402 + (((tickAnim - 5) / 10) * (55.13262-(53.79402)));
            yy = -8.73009 + (((tickAnim - 5) / 10) * (-5.76608-(-8.73009)));
            zz = 11.78186 + (((tickAnim - 5) / 10) * (2.13703-(11.78186)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 55.13262 + (((tickAnim - 15) / 5) * (4.66646-(55.13262)));
            yy = -5.76608 + (((tickAnim - 15) / 5) * (-7.10151-(-5.76608)));
            zz = 2.13703 + (((tickAnim - 15) / 5) * (5.70156-(2.13703)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 4.66646 + (((tickAnim - 20) / 5) * (-0.7997-(4.66646)));
            yy = -7.10151 + (((tickAnim - 20) / 5) * (-8.43694-(-7.10151)));
            zz = 5.70156 + (((tickAnim - 20) / 5) * (9.26609-(5.70156)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -0.7997 + (((tickAnim - 25) / 11) * (74.2003-(-0.7997)));
            yy = -8.43694 + (((tickAnim - 25) / 11) * (-8.43694-(-8.43694)));
            zz = 9.26609 + (((tickAnim - 25) / 11) * (9.26609-(9.26609)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle6c, tentacle6c.rotateAngleX + (float) Math.toRadians(xx), tentacle6c.rotateAngleY + (float) Math.toRadians(yy), tentacle6c.rotateAngleZ + (float) Math.toRadians(zz));
    }

}
