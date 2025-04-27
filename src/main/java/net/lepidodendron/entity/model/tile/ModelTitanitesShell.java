package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelTitanitesShell extends AdvancedModelBaseExtended {
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

    public ModelTitanitesShell() {
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
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.offsetY = -0.0F;
        this.root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
