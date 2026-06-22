package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelAncylocerasShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer shell8;
    private final AdvancedModelRenderer shell9;
    private final AdvancedModelRenderer shell10;
    private final AdvancedModelRenderer Mantle;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer Mantle2;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle1b;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle2b;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Tentacle3a;
    private final AdvancedModelRenderer Tentacle3b;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Tentacle4a;
    private final AdvancedModelRenderer Tentacle4b;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Tentacle5a;
    private final AdvancedModelRenderer Tentacle5b;
    private final AdvancedModelRenderer Tentacle6a;
    private final AdvancedModelRenderer Tentacle6b;
    private final AdvancedModelRenderer Tentacle7a;
    private final AdvancedModelRenderer Tentacle7b;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle8b;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Tentacle9c;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;

    public ModelAncylocerasShell() {
        this.textureWidth = 79;
        this.textureHeight = 72;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, -2.0F, 5.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 17.0F, 1.0F);
        this.root.addChild(shell);
        this.setRotateAngle(shell, -0.3927F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 21, 0, -3.0F, 0.0F, -7.0F, 6, 8, 7, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.9599F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 21, 16, -3.0F, 0.0F, -7.0F, 6, 8, 7, -0.01F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.7418F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 0, 32, -2.5F, 0.0F, -7.0F, 5, 8, 7, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.829F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 25, 32, -2.5F, 0.0F, -7.0F, 5, 8, 7, -0.01F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.8727F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 0, 0, -2.0F, 0.0F, -6.0F, 4, 16, 6, 0.0F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.4363F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 0, 48, -2.0F, 0.0F, -5.0F, 4, 9, 5, -0.01F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, -0.6981F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 19, 48, -1.5F, 0.0F, -4.0F, 3, 6, 4, 0.0F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, -0.8727F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 48, 21, -1.5F, 0.0F, -3.0F, 3, 6, 3, -0.01F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.shell8.addChild(shell9);
        this.setRotateAngle(shell9, -1.0472F, 0.0F, 0.0F);
        this.shell9.cubeList.add(new ModelBox(shell9, 45, 48, -1.0F, 0.0F, -3.0F, 2, 6, 3, 0.0F, false));

        this.shell10 = new AdvancedModelRenderer(this);
        this.shell10.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.shell9.addChild(shell10);
        this.setRotateAngle(shell10, -1.1345F, 0.0F, 0.0F);
        this.shell10.cubeList.add(new ModelBox(shell10, 13, 23, -0.5F, 0.0F, -2.0F, 1, 5, 2, 0.0F, false));
        this.shell10.cubeList.add(new ModelBox(shell10, 34, 48, 0.0F, 1.0F, -6.0F, 0, 5, 5, 0.0F, false));

        this.Mantle = new AdvancedModelRenderer(this);
        this.Mantle.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.shell.addChild(Mantle);
        this.setRotateAngle(Mantle, -0.5236F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 48, 0, -2.0F, -5.0F, 0.0F, 4, 5, 5, -0.02F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.0F, -4.35F, 5.525F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, 0.5164F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 67, 14, -1.0F, -1.295F, -1.0445F, 2, 2, 3, 0.0F, false));

        this.Mantle2 = new AdvancedModelRenderer(this);
        this.Mantle2.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.Mantle.addChild(Mantle2);
        this.setRotateAngle(Mantle2, 0.6981F, 0.0F, 0.0F);
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 48, 11, -2.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(1.75F, 1.55F, 0.0F);
        this.Mantle2.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.5742F, 0.2213F, -0.3271F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 69, 42, -1.0F, -1.0F, -1.0F, 2, 2, 3, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-1.75F, 1.55F, 0.0F);
        this.Mantle2.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.5742F, -0.2213F, 0.3271F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 69, 48, -1.0F, -1.0F, -1.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(-0.7F, 3.5F, 4.5F);
        this.Mantle2.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, 0.1222F, 0.0F, 0.0F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 0, 23, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, -0.1484F, 0.0567F, -0.0007F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 50, 31, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(-1.9F, 3.25F, 4.5F);
        this.Mantle2.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, 0.0173F, 0.0306F, -0.7871F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 50, 38, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.setRotateAngle(Tentacle2b, 0.0F, 0.3316F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tentacle2b.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0964F, -0.2137F, 0.0021F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 45, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(-1.9F, 2.0F, 4.5F);
        this.Mantle2.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, -0.1004F, 0.0261F, -0.0033F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 56, 52, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, 0.2822F, 0.1146F, -0.0103F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tentacle3b.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1789F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 59, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(-1.9F, 0.85F, 4.5F);
        this.Mantle2.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, -0.2253F, -0.0818F, -0.8174F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 32, 59, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, 0.3561F, 0.236F, 0.0914F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tentacle4b.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2336F, -0.1401F, 0.0332F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 59, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(-0.7F, 0.625F, 4.5F);
        this.Mantle2.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, -0.2051F, 0.0F, 0.0F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 58, 59, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.setRotateAngle(Tentacle5b, 0.0963F, 0.0354F, 0.0171F);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 61, 21, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(0.7F, 3.5F, 4.5F);
        this.Mantle2.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, 0.1222F, 0.0F, 0.0F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 0, 63, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, -0.1484F, -0.0567F, 0.0007F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 63, 28, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(1.9F, 3.25F, 4.5F);
        this.Mantle2.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, -0.0002F, -0.048F, 0.7872F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 63, 35, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.setRotateAngle(Tentacle7b, 0.0F, -0.3316F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tentacle7b.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.2356F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 66, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(1.9F, 2.0F, 4.5F);
        this.Mantle2.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, -0.1004F, -0.0087F, 0.001F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 26, 66, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, 0.2822F, -0.1146F, 0.0103F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tentacle8b.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1658F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 39, 66, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(1.9F, 0.85F, 4.5F);
        this.Mantle2.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, -0.1907F, 0.1078F, 0.814F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 52, 66, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, 0.3561F, -0.236F, -0.0914F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tentacle9b.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2811F, 0.1132F, -0.0326F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 65, 66, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle9c = new AdvancedModelRenderer(this);
        this.Tentacle9c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle9b.addChild(Tentacle9c);
        this.setRotateAngle(Tentacle9c, 0.3199F, 0.1379F, -0.0408F);


        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(0.7F, 0.625F, 4.5F);
        this.Mantle2.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, -0.2007F, 0.0F, 0.0F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 67, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, 0.0963F, -0.0354F, -0.0171F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 67, 7, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.offsetY = -1.3F;
        //this.Root.offsetZ = 1.0F;
        //this.base.rotateAngleX = (float) Math.toRadians(25);
        this.root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
