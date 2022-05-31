package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelBomakellia extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer frond;
    private final AdvancedModelRenderer frondmain;
    private final AdvancedModelRenderer frondb;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frondb2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer frondb3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer frondb4;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer frondb5;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer frondb6;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer frondb7;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer fronda;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer fronda2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer fronda3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer fronda4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer fronda5;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer fronda6;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer fronda7;
    private final AdvancedModelRenderer cube_r14;

    public ModelBomakellia() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(8.0F, 24.0F, -8.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 6, -9.0F, -1.0F, 7.0F, 2, 1, 2, 0.0F, false));

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(-8.0F, -1.0F, 8.0F);
        this.bone.addChild(base);
        this.base.cubeList.add(new ModelBox(base, 0, 12, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.frond = new AdvancedModelRenderer(this);
        this.frond.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.base.addChild(frond);
        this.frond.cubeList.add(new ModelBox(frond, 7, 12, -1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F, false));

        this.frondmain = new AdvancedModelRenderer(this);
        this.frondmain.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond.addChild(frondmain);


        this.frondb = new AdvancedModelRenderer(this);
        this.frondb.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frondmain.addChild(frondb);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.frondb.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3927F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 6, -1.5F, -2.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.frondb2 = new AdvancedModelRenderer(this);
        this.frondb2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frondb.addChild(frondb2);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.frondb2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3927F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 5, -1.5F, -3.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.frondb3 = new AdvancedModelRenderer(this);
        this.frondb3.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frondb2.addChild(frondb3);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.frondb3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.3927F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 4, -1.5F, -4.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.frondb4 = new AdvancedModelRenderer(this);
        this.frondb4.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frondb3.addChild(frondb4);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.frondb4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 3, -1.5F, -5.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.frondb5 = new AdvancedModelRenderer(this);
        this.frondb5.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frondb4.addChild(frondb5);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.frondb5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3927F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 2, -1.5F, -6.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.frondb6 = new AdvancedModelRenderer(this);
        this.frondb6.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frondb5.addChild(frondb6);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.frondb6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3927F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 1, -1.5F, -7.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.frondb7 = new AdvancedModelRenderer(this);
        this.frondb7.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frondb6.addChild(frondb7);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.frondb7.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.3927F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 0, -1.5F, -8.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.fronda = new AdvancedModelRenderer(this);
        this.fronda.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frondmain.addChild(fronda);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.fronda.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3927F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 6, -1.5F, -2.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.fronda2 = new AdvancedModelRenderer(this);
        this.fronda2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.fronda.addChild(fronda2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.fronda2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.3927F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 5, -1.5F, -3.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.fronda3 = new AdvancedModelRenderer(this);
        this.fronda3.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.fronda2.addChild(fronda3);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.fronda3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3927F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 4, -1.5F, -4.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.fronda4 = new AdvancedModelRenderer(this);
        this.fronda4.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.fronda3.addChild(fronda4);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.fronda4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3927F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 3, -1.5F, -5.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.fronda5 = new AdvancedModelRenderer(this);
        this.fronda5.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.fronda4.addChild(fronda5);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.fronda5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.3927F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 2, -1.5F, -6.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.fronda6 = new AdvancedModelRenderer(this);
        this.fronda6.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.fronda5.addChild(fronda6);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.fronda6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.3927F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 1, -1.5F, -7.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.fronda7 = new AdvancedModelRenderer(this);
        this.fronda7.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.fronda6.addChild(fronda7);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.fronda7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.3927F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 0, -1.5F, -8.0F, 0.0F, 3, 1, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        AdvancedModelRenderer[] FrondA = {this.fronda,this.fronda2,this.fronda3,this.fronda4,this.fronda5,this.fronda6,this.fronda7};
        AdvancedModelRenderer[] FrondB = {this.frondb,this.frondb2,this.frondb3,this.frondb4,this.frondb5,this.frondb6,this.frondb7};
        float speed = 0.06F;
        this.chainWave(FrondA, speed, 0.18F, 4, f, 0.85F);
        this.chainWave(FrondB, speed, 0.18F, 4, f, 0.85F);
        this.base.flap(0.05F, 0.1F, false, 0F, 0F, f, -0.5F);
        this.bone.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
