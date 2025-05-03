package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAmmonite_Titanites;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTitanites extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Mantle;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle1b;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle2b;
    private final AdvancedModelRenderer Tentacle3a;
    private final AdvancedModelRenderer Tentacle3b;
    private final AdvancedModelRenderer Tentacle3c;
    private final AdvancedModelRenderer Tentacle4a;
    private final AdvancedModelRenderer Tentacle1a_r1;
    private final AdvancedModelRenderer Tentacle4b;
    private final AdvancedModelRenderer Tentacle1b_r1;
    private final AdvancedModelRenderer Tentacle5a;
    private final AdvancedModelRenderer Tentacle5b;
    private final AdvancedModelRenderer Tentacle6a;
    private final AdvancedModelRenderer Tentacle6b;
    private final AdvancedModelRenderer Tentacle7a;
    private final AdvancedModelRenderer Tentacle7b;
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle8b;
    private final AdvancedModelRenderer Tentacle8c;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle1a_r2;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer Tentacle1b_r2;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;

    private ModelAnimator animator;

    public ModelTitanites() {
        this.textureWidth = 136;
        this.textureHeight = 136;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -19.6609F, 0.4815F);
        this.root.addChild(shell);
        this.setRotateAngle(shell, -0.3927F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -5.0F, 7.4609F, -7.4815F, 10, 12, 16, 0.004F, false));
        this.shell.cubeList.add(new ModelBox(shell, 36, 0, -4.5F, -16.8391F, -4.4815F, 9, 8, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, 8.1609F, 17.0185F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.829F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 28, -3.0F, -0.2F, -8.6F, 10, 14, 11, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 9.6609F, 18.7185F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 52, -3.0F, -7.96F, -10.8544F, 10, 8, 11, 0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -11.5391F, -14.3815F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -2.6442F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 0, -3.0F, -8.1088F, -11.1705F, 9, 8, 11, 0.004F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, -0.0391F, -18.4815F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.946F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 53, -3.0F, -8.7088F, -12.173F, 9, 9, 12, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, 10.9609F, -14.4815F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.2043F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 16, -3.0F, -9.9165F, -11.8759F, 9, 10, 12, 0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, 11.0609F, -14.4815F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.8727F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 42, -3.0F, -9.9931F, 0.0599F, 10, 10, 11, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, 4.6609F, -2.1815F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 2.1293F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 93, 45, -2.0F, -6.9078F, -3.0792F, 7, 7, 8, 0.03F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -3.2391F, -0.0815F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6109F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 70, 105, -1.0F, -0.0614F, -1.5662F, 4, 5, 6, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 105, -1.5F, -3.9614F, -1.5662F, 5, 4, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.1609F, -2.0815F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.0908F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 99, 0, -2.0F, -3.7573F, -0.0268F, 6, 4, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 2.4609F, 0.9185F);
        this.shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 2.3998F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 98, 19, -2.0F, -4.0883F, -0.2612F, 6, 4, 7, 0.004F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -1.5391F, 3.9185F);
        this.shell.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -2.2253F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 96, 63, -2.0F, -7.1433F, -0.2615F, 6, 7, 8, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -1.2391F, 4.7185F);
        this.shell.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.1956F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 58, 71, -2.0F, -5.7562F, -10.0231F, 6, 7, 12, 0.02F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5F, -5.7391F, 0.3185F);
        this.shell.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.288F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 63, 90, -2.0F, -6.798F, -2.8397F, 7, 7, 8, -0.007F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, -3.7391F, -4.1815F);
        this.shell.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4276F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 92, -2.0F, -6.7518F, -3.0155F, 7, 7, 8, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, 1.2609F, -4.1815F);
        this.shell.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.5184F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 93, 97, -2.0F, -7.0134F, -1.0224F, 7, 7, 7, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.0F, 5.4609F, 2.8185F);
        this.shell.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 3.1329F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 86, 82, -2.0F, -6.1515F, -3.0724F, 8, 7, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.0F, 0.4609F, 14.5185F);
        this.shell.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -2.1904F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 71, 27, -2.0F, -0.2298F, -0.2076F, 8, 7, 11, 0.004F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.0F, -11.5391F, 11.9185F);
        this.shell.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.3352F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 63, -2.0F, 0.0433F, 0.0678F, 8, 8, 12, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.0F, -16.8391F, 3.5185F);
        this.shell.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.5672F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 74, -2.0F, 0.0F, 0.0F, 8, 8, 10, 0.02F, false));

        this.Mantle = new AdvancedModelRenderer(this);
        this.Mantle.setRotationPoint(0.0F, -0.7391F, 13.3185F);
        this.shell.addChild(Mantle);
        this.setRotateAngle(Mantle, 0.5744F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 27, 83, -4.5F, -0.8117F, -0.9538F, 9, 7, 9, 0.0F, false));
        this.Mantle.cubeList.add(new ModelBox(Mantle, 0, 58, 1.5F, -2.8117F, 3.0462F, 3, 2, 3, 0.0F, false));
        this.Mantle.cubeList.add(new ModelBox(Mantle, 0, 53, -4.5F, -2.8117F, 3.0462F, 3, 2, 3, 0.0F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.0F, 4.4383F, 4.0462F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.474F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 30, 99, -2.5F, 0.0F, -2.0F, 5, 2, 7, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(-1.225F, 5.075F, 7.75F);
        this.Mantle.addChild(Tentacle1a);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 65, 116, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 36, 117, -1.0F, -1.0F, 0.0F, 2, 2, 7, -0.2F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(-2.825F, 4.15F, 7.75F);
        this.Mantle.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, 0.0F, 0.0F, 0.0F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 110, 78, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 83, 111, -1.0F, -1.0F, 0.0F, 2, 2, 7, -0.2F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(-3.25F, 2.925F, 7.75F);
        this.Mantle.addChild(Tentacle3a);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 109, 30, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, 0.0F, 0.0F, 0.0F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 110, 10, -1.0F, -1.0F, 0.0F, 2, 2, 7, -0.2F, false));

        this.Tentacle3c = new AdvancedModelRenderer(this);
        this.Tentacle3c.setRotationPoint(-1.0F, 1.0F, 3.5F);
        this.Tentacle3a.addChild(Tentacle3c);
        this.Tentacle3c.cubeList.add(new ModelBox(Tentacle3c, 0, 0, -3.0F, 0.0F, -3.5F, 3, 0, 7, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(-2.825F, 1.225F, 7.75F);
        this.Mantle.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, 0.0F, 0.0F, 0.0F);


        this.Tentacle1a_r1 = new AdvancedModelRenderer(this);
        this.Tentacle1a_r1.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle4a.addChild(Tentacle1a_r1);
        this.setRotateAngle(Tentacle1a_r1, 0.0F, 0.0F, -1.5708F);
        this.Tentacle1a_r1.cubeList.add(new ModelBox(Tentacle1a_r1, 0, 116, -1.0F, -1.0F, -3.5F, 2, 2, 7, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Tentacle4a.addChild(Tentacle4b);


        this.Tentacle1b_r1 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r1.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle4b.addChild(Tentacle1b_r1);
        this.setRotateAngle(Tentacle1b_r1, 0.0F, 0.0F, -1.5708F);
        this.Tentacle1b_r1.cubeList.add(new ModelBox(Tentacle1b_r1, 18, 116, -1.0F, -1.0F, -3.5F, 2, 2, 7, -0.2F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(-1.225F, 0.3F, 7.75F);
        this.Mantle.addChild(Tentacle5a);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 115, 39, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 47, 115, -1.0F, -1.0F, 0.0F, 2, 2, 7, -0.2F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(1.225F, 5.075F, 7.75F);
        this.Mantle.addChild(Tentacle6a);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 116, 53, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 116, 62, -1.0F, -1.0F, 0.0F, 2, 2, 7, -0.2F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(2.825F, 4.15F, 7.75F);
        this.Mantle.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, 0.0F, 0.0F, 0.0F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 18, 107, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 36, 108, -1.0F, -1.0F, 0.0F, 2, 2, 7, -0.2F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(3.25F, 2.925F, 7.75F);
        this.Mantle.addChild(Tentacle8a);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 82, 71, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, 0.0F, 0.0F, 0.0F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 0, 107, -1.0F, -1.0F, 0.0F, 2, 2, 7, -0.2F, false));

        this.Tentacle8c = new AdvancedModelRenderer(this);
        this.Tentacle8c.setRotationPoint(1.0F, 1.0F, 3.5F);
        this.Tentacle8a.addChild(Tentacle8c);
        this.Tentacle8c.cubeList.add(new ModelBox(Tentacle8c, 0, 7, 0.0F, 0.0F, -3.5F, 3, 0, 7, 0.0F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(2.825F, 1.225F, 7.75F);
        this.Mantle.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, 0.0F, 0.0F, 0.0F);


        this.Tentacle1a_r2 = new AdvancedModelRenderer(this);
        this.Tentacle1a_r2.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle9a.addChild(Tentacle1a_r2);
        this.setRotateAngle(Tentacle1a_r2, 0.0F, 0.0F, 1.5708F);
        this.Tentacle1a_r2.cubeList.add(new ModelBox(Tentacle1a_r2, 101, 111, -1.0F, -1.0F, -3.5F, 2, 2, 7, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Tentacle9a.addChild(Tentacle9b);


        this.Tentacle1b_r2 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r2.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle9b.addChild(Tentacle1b_r2);
        this.setRotateAngle(Tentacle1b_r2, 0.0F, 0.0F, 1.5708F);
        this.Tentacle1b_r2.cubeList.add(new ModelBox(Tentacle1b_r2, 112, 113, -1.0F, -1.0F, -3.5F, 2, 2, 7, -0.2F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(1.225F, 0.3F, 7.75F);
        this.Mantle.addChild(Tentacle10a);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 114, 90, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 114, 104, -1.0F, -1.0F, 0.0F, 2, 2, 7, -0.2F, false));
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetY = -0.2F;
        this.root.offsetX = -0.15F;
        this.root.offsetZ = -0.4F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetZ = -0.1F;
        this.root.offsetY = -0.03F;
        this.root.offsetX = -0.02F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.35F;
        this.root.offsetX = -0.6F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 1.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, -0.6F, 0.8F, -0.2F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAmmonite_Titanites ee = (EntityPrehistoricFloraAmmonite_Titanites) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmmonite_Titanites entity = (EntityPrehistoricFloraAmmonite_Titanites) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(shell, shell.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), shell.rotateAngleY + (float) Math.toRadians(0), shell.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*5));
        this.shell.rotationPointX = this.shell.rotationPointX + (float)(0);
        this.shell.rotationPointY = this.shell.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1);
        this.shell.rotationPointZ = this.shell.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*2);


        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5), Mantle.rotateAngleY + (float) Math.toRadians(0), Mantle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-2.5));
        this.Mantle.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.01));


        this.setRotateAngle(Siphon, Siphon.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5), Siphon.rotateAngleY + (float) Math.toRadians(0), Siphon.rotateAngleZ + (float) Math.toRadians(0));
        this.Siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.05),(float)(0.9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.1),(float)(0.7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-0.2));


        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle1a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle1a.rotateAngleZ + (float) Math.toRadians(5));
        this.Tentacle1a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tentacle1b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), Tentacle1b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle2a.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle2a.rotateAngleZ + (float) Math.toRadians(-15));
        this.Tentacle2a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), Tentacle2b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tentacle2b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(0), Tentacle3a.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle3a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle3a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(-5), Tentacle3b.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tentacle3b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle4a.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle4a.rotateAngleZ + (float) Math.toRadians(15));
        this.Tentacle4a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle4b.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tentacle4b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle5a.rotateAngleY + (float) Math.toRadians(2.5), Tentacle5a.rotateAngleZ + (float) Math.toRadians(-5));
        this.Tentacle5a.rotationPointX = this.Tentacle5a.rotationPointX + (float)(0.5);
        this.Tentacle5a.rotationPointY = this.Tentacle5a.rotationPointY - (float)(0);
        this.Tentacle5a.rotationPointZ = this.Tentacle5a.rotationPointZ + (float)(0);
        this.Tentacle5a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle5b, Tentacle5b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), Tentacle5b.rotateAngleY + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), Tentacle5b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle6a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle6a.rotateAngleZ + (float) Math.toRadians(-5));
        this.Tentacle6a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tentacle6b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle6b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle7a.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle7a.rotateAngleZ + (float) Math.toRadians(15));
        this.Tentacle7a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle7b, Tentacle7b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), Tentacle7b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), Tentacle7b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle8a, Tentacle8a.rotateAngleX + (float) Math.toRadians(0), Tentacle8a.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle8a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle8a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle8b, Tentacle8b.rotateAngleX + (float) Math.toRadians(-5), Tentacle8b.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), Tentacle8b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle9a.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle9a.rotateAngleZ + (float) Math.toRadians(-15));
        this.Tentacle9a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle9b, Tentacle9b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle9b.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), Tentacle9b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle10a.rotateAngleY + (float) Math.toRadians(-2.5), Tentacle10a.rotateAngleZ + (float) Math.toRadians(5));
        this.Tentacle10a.rotationPointX = this.Tentacle10a.rotationPointX + (float)(-0.5);
        this.Tentacle10a.rotationPointY = this.Tentacle10a.rotationPointY - (float)(0);
        this.Tentacle10a.rotationPointZ = this.Tentacle10a.rotationPointZ + (float)(0);
        this.Tentacle10a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle10b, Tentacle10b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), Tentacle10b.rotateAngleY + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle10b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle3c, Tentacle3c.rotateAngleX + (float) Math.toRadians(0), Tentacle3c.rotateAngleY + (float) Math.toRadians(0), Tentacle3c.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*30));


        this.setRotateAngle(Tentacle8c, Tentacle8c.rotateAngleX + (float) Math.toRadians(0), Tentacle8c.rotateAngleY + (float) Math.toRadians(0), Tentacle8c.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-30));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmmonite_Titanites entity = (EntityPrehistoricFloraAmmonite_Titanites) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(shell, shell.rotateAngleX + (float) Math.toRadians(xx), shell.rotateAngleY + (float) Math.toRadians(yy), shell.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.shell.rotationPointX = this.shell.rotationPointX + (float)(xx);
        this.shell.rotationPointY = this.shell.rotationPointY - (float)(yy);
        this.shell.rotationPointZ = this.shell.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 30) / 10) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 40) / 30) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(xx), Mantle.rotateAngleY + (float) Math.toRadians(yy), Mantle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01)));
            zz = 1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01 + (((tickAnim - 0) / 30) * (1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01-(1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01)));
            zz = 1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01 + (((tickAnim - 30) / 10) * (1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01-(1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01)));
            zz = 1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01 + (((tickAnim - 40) / 30) * (1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01-(1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01)));
            zz = 1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01 + (((tickAnim - 70) / 10) * (1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01-(1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Mantle.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Siphon, Siphon.rotateAngleX + (float) Math.toRadians(xx), Siphon.rotateAngleY + (float) Math.toRadians(yy), Siphon.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2 + (((tickAnim - 0) / 30) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2)));
            zz = 0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2 + (((tickAnim - 0) / 30) * (0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2-(0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2 + (((tickAnim - 30) / 10) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2)));
            zz = 0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2 + (((tickAnim - 30) / 10) * (0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2-(0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2 + (((tickAnim - 40) / 30) * (0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.01-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2)));
            zz = 0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2 + (((tickAnim - 40) / 30) * (0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.02-(0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05)));
            yy = 0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.01 + (((tickAnim - 70) / 10) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2-(0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.01)));
            zz = 0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.02 + (((tickAnim - 70) / 10) * (0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2-(0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.02)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Siphon.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5)));
            zz = 10 + (((tickAnim - 0) / 30) * (10-(10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5)));
            zz = 10 + (((tickAnim - 30) / 10) * (5-(10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            zz = 5 + (((tickAnim - 40) / 30) * (5-(5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            zz = 5 + (((tickAnim - 70) / 10) * (10-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(xx), Tentacle1a.rotateAngleY + (float) Math.toRadians(yy), Tentacle1a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle1a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 30) / 10) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            yy = 0 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 40) / 30) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(xx), Tentacle1b.rotateAngleY + (float) Math.toRadians(yy), Tentacle1b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            zz = -20 + (((tickAnim - 0) / 30) * (-20-(-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            zz = -20 + (((tickAnim - 30) / 10) * (-15-(-20)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = -15 + (((tickAnim - 40) / 30) * (-15-(-15)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 70) / 10) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = -15 + (((tickAnim - 70) / 10) * (-20-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(xx), Tentacle2a.rotateAngleY + (float) Math.toRadians(yy), Tentacle2a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle2a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 70) / 10) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(xx), Tentacle2b.rotateAngleY + (float) Math.toRadians(yy), Tentacle2b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 0) / 30) * (-10-(-10)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 30) / 10) * (0-(-10)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (-10-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(xx), Tentacle3a.rotateAngleY + (float) Math.toRadians(yy), Tentacle3a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle3a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 70) / 10) * (0-(-5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(xx), Tentacle3b.rotateAngleY + (float) Math.toRadians(yy), Tentacle3b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            zz = 20 + (((tickAnim - 0) / 30) * (20-(20)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            zz = 20 + (((tickAnim - 30) / 10) * (15-(20)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 15 + (((tickAnim - 40) / 30) * (15-(15)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 15 + (((tickAnim - 70) / 10) * (20-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(xx), Tentacle4a.rotateAngleY + (float) Math.toRadians(yy), Tentacle4a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle4a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 70) / 10) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(xx), Tentacle4b.rotateAngleY + (float) Math.toRadians(yy), Tentacle4b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5)));
            zz = -10 + (((tickAnim - 0) / 30) * (-10-(-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5 + (((tickAnim - 30) / 10) * (2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5)));
            zz = -10 + (((tickAnim - 30) / 10) * (-5-(-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 2.5 + (((tickAnim - 40) / 30) * (2.5-(2.5)));
            zz = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 2.5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5-(2.5)));
            zz = -5 + (((tickAnim - 70) / 10) * (-10-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(xx), Tentacle5a.rotateAngleY + (float) Math.toRadians(yy), Tentacle5a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0.5 + (((tickAnim - 0) / 30) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.5 + (((tickAnim - 30) / 10) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0.5 + (((tickAnim - 40) / 30) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.5 + (((tickAnim - 70) / 10) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tentacle5a.rotationPointX = this.Tentacle5a.rotationPointX + (float)(xx);
        this.Tentacle5a.rotationPointY = this.Tentacle5a.rotationPointY - (float)(yy);
        this.Tentacle5a.rotationPointZ = this.Tentacle5a.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle5a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            yy = 0 + (((tickAnim - 30) / 10) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
            yy = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 40) / 30) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
            yy = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 70) / 10) * (0-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle5b, Tentacle5b.rotateAngleX + (float) Math.toRadians(xx), Tentacle5b.rotateAngleY + (float) Math.toRadians(yy), Tentacle5b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            zz = -10 + (((tickAnim - 0) / 30) * (-10-(-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            zz = -10 + (((tickAnim - 30) / 10) * (-5-(-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = -5 + (((tickAnim - 70) / 10) * (-10-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(xx), Tentacle6a.rotateAngleY + (float) Math.toRadians(yy), Tentacle6a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle6a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 30) / 10) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            yy = 0 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 40) / 30) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(xx), Tentacle6b.rotateAngleY + (float) Math.toRadians(yy), Tentacle6b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            zz = 20 + (((tickAnim - 0) / 30) * (20-(20)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            zz = 20 + (((tickAnim - 30) / 10) * (15-(20)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 15 + (((tickAnim - 40) / 30) * (15-(15)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 70) / 10) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 15 + (((tickAnim - 70) / 10) * (20-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(xx), Tentacle7a.rotateAngleY + (float) Math.toRadians(yy), Tentacle7a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle7a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 70) / 10) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7b, Tentacle7b.rotateAngleX + (float) Math.toRadians(xx), Tentacle7b.rotateAngleY + (float) Math.toRadians(yy), Tentacle7b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 0) / 30) * (-10-(-10)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 30) / 10) * (0-(-10)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (-10-(0)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle8a, Tentacle8a.rotateAngleX + (float) Math.toRadians(xx), Tentacle8a.rotateAngleY + (float) Math.toRadians(yy), Tentacle8a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle8a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 70) / 10) * (0-(-5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle8b, Tentacle8b.rotateAngleX + (float) Math.toRadians(xx), Tentacle8b.rotateAngleY + (float) Math.toRadians(yy), Tentacle8b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            zz = -20 + (((tickAnim - 0) / 30) * (-20-(-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            zz = -20 + (((tickAnim - 30) / 10) * (-15-(-20)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = -15 + (((tickAnim - 40) / 30) * (-15-(-15)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = -15 + (((tickAnim - 70) / 10) * (-20-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(xx), Tentacle9a.rotateAngleY + (float) Math.toRadians(yy), Tentacle9a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle9a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 70) / 10) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle9b, Tentacle9b.rotateAngleX + (float) Math.toRadians(xx), Tentacle9b.rotateAngleY + (float) Math.toRadians(yy), Tentacle9b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            zz = 10 + (((tickAnim - 0) / 30) * (10-(10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 30) / 10) * (-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            zz = 10 + (((tickAnim - 30) / 10) * (5-(10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = -2.5 + (((tickAnim - 40) / 30) * (-2.5-(-2.5)));
            zz = 5 + (((tickAnim - 40) / 30) * (5-(5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = -2.5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(-2.5)));
            zz = 5 + (((tickAnim - 70) / 10) * (10-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(xx), Tentacle10a.rotateAngleY + (float) Math.toRadians(yy), Tentacle10a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.5 + (((tickAnim - 0) / 30) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -0.5 + (((tickAnim - 30) / 10) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -0.5 + (((tickAnim - 40) / 30) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -0.5 + (((tickAnim - 70) / 10) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tentacle10a.rotationPointX = this.Tentacle10a.rotationPointX + (float)(xx);
        this.Tentacle10a.rotationPointY = this.Tentacle10a.rotationPointY - (float)(yy);
        this.Tentacle10a.rotationPointZ = this.Tentacle10a.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle10a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            yy = 0 + (((tickAnim - 30) / 10) * (1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
            yy = 1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 40) / 30) * (1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
            yy = 1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 70) / 10) * (0-(1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle10b, Tentacle10b.rotateAngleX + (float) Math.toRadians(xx), Tentacle10b.rotateAngleY + (float) Math.toRadians(yy), Tentacle10b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*30 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*30)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*30 + (((tickAnim - 30) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*30)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle3c, Tentacle3c.rotateAngleX + (float) Math.toRadians(xx), Tentacle3c.rotateAngleY + (float) Math.toRadians(yy), Tentacle3c.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 30) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (1-(0)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 30) / 10) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 30) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (0-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle3c.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-30 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-30)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-30 + (((tickAnim - 30) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-30)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle8c, Tentacle8c.rotateAngleX + (float) Math.toRadians(xx), Tentacle8c.rotateAngleY + (float) Math.toRadians(yy), Tentacle8c.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 30) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (1-(0)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 30) / 10) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 30) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (0-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle8c.setScale((float)xx, (float)yy, (float)zz);

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraAmmonite_Titanites ee = (EntityPrehistoricFloraAmmonite_Titanites) e;

        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = -0.175F;
            this.root.offsetX = -1F;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

