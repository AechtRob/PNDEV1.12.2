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
        textureWidth = 16;
        textureHeight = 16;

        bone = new AdvancedModelRenderer(this);
        bone.setRotationPoint(8.0F, 24.0F, -8.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -9.0F, -1.0F, 7.0F, 2, 1, 2, 0.0F, false));

        base = new AdvancedModelRenderer(this);
        base.setRotationPoint(-8.0F, -1.0F, 8.0F);
        bone.addChild(base);
        base.cubeList.add(new ModelBox(base, 12, 0, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        frond = new AdvancedModelRenderer(this);
        frond.setRotationPoint(0.0F, -1.0F, 0.0F);
        base.addChild(frond);
        frond.cubeList.add(new ModelBox(frond, 0, 3, -1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F, false));

        frondmain = new AdvancedModelRenderer(this);
        frondmain.setRotationPoint(0.0F, -1.0F, 0.0F);
        frond.addChild(frondmain);


        frondb = new AdvancedModelRenderer(this);
        frondb.setRotationPoint(0.0F, 0.0F, 0.0F);
        frondmain.addChild(frondb);


        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        frondb.addChild(cube_r1);
        setRotateAngle(cube_r1, 0.0F, 0.3927F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 5, -1.5F, -2.0F, 0.0F, 3, 1, 0, 0.0F, false));

        frondb2 = new AdvancedModelRenderer(this);
        frondb2.setRotationPoint(0.0F, -1.0F, 0.0F);
        frondb.addChild(frondb2);


        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 2.0F, 0.0F);
        frondb2.addChild(cube_r2);
        setRotateAngle(cube_r2, 0.0F, 0.3927F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 4, -1.5F, -3.0F, 0.0F, 3, 1, 0, 0.0F, false));

        frondb3 = new AdvancedModelRenderer(this);
        frondb3.setRotationPoint(0.0F, -1.0F, 0.0F);
        frondb2.addChild(frondb3);


        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 3.0F, 0.0F);
        frondb3.addChild(cube_r3);
        setRotateAngle(cube_r3, 0.0F, 0.3927F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 1, -1.5F, -4.0F, 0.0F, 3, 1, 0, 0.0F, false));

        frondb4 = new AdvancedModelRenderer(this);
        frondb4.setRotationPoint(0.0F, -1.0F, 0.0F);
        frondb3.addChild(frondb4);


        cube_r4 = new AdvancedModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, 4.0F, 0.0F);
        frondb4.addChild(cube_r4);
        setRotateAngle(cube_r4, 0.0F, 0.3927F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 0, -1.5F, -5.0F, 0.0F, 3, 1, 0, 0.0F, false));

        frondb5 = new AdvancedModelRenderer(this);
        frondb5.setRotationPoint(0.0F, -1.0F, 0.0F);
        frondb4.addChild(frondb5);


        cube_r5 = new AdvancedModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, 5.0F, 0.0F);
        frondb5.addChild(cube_r5);
        setRotateAngle(cube_r5, 0.0F, 0.3927F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 6, -1.5F, -6.0F, 0.0F, 3, 1, 0, 0.0F, false));

        frondb6 = new AdvancedModelRenderer(this);
        frondb6.setRotationPoint(0.0F, -1.0F, 0.0F);
        frondb5.addChild(frondb6);


        cube_r6 = new AdvancedModelRenderer(this);
        cube_r6.setRotationPoint(0.0F, 6.0F, 0.0F);
        frondb6.addChild(cube_r6);
        setRotateAngle(cube_r6, 0.0F, 0.3927F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 5, 3, -1.5F, -7.0F, 0.0F, 3, 1, 0, 0.0F, false));

        frondb7 = new AdvancedModelRenderer(this);
        frondb7.setRotationPoint(0.0F, -1.0F, 0.0F);
        frondb6.addChild(frondb7);


        cube_r7 = new AdvancedModelRenderer(this);
        cube_r7.setRotationPoint(0.0F, 7.0F, 0.0F);
        frondb7.addChild(cube_r7);
        setRotateAngle(cube_r7, 0.0F, 0.3927F, 0.0F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 5, -1.5F, -8.0F, 0.0F, 3, 1, 0, 0.0F, false));

        fronda = new AdvancedModelRenderer(this);
        fronda.setRotationPoint(0.0F, 0.0F, 0.0F);
        frondmain.addChild(fronda);


        cube_r8 = new AdvancedModelRenderer(this);
        cube_r8.setRotationPoint(0.0F, 1.0F, 0.0F);
        fronda.addChild(cube_r8);
        setRotateAngle(cube_r8, 0.0F, -0.3927F, 0.0F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 5, -1.5F, -2.0F, 0.0F, 3, 1, 0, 0.0F, false));

        fronda2 = new AdvancedModelRenderer(this);
        fronda2.setRotationPoint(0.0F, -1.0F, 0.0F);
        fronda.addChild(fronda2);


        cube_r9 = new AdvancedModelRenderer(this);
        cube_r9.setRotationPoint(0.0F, 2.0F, 0.0F);
        fronda2.addChild(cube_r9);
        setRotateAngle(cube_r9, 0.0F, -0.3927F, 0.0F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 4, -1.5F, -3.0F, 0.0F, 3, 1, 0, 0.0F, false));

        fronda3 = new AdvancedModelRenderer(this);
        fronda3.setRotationPoint(0.0F, -1.0F, 0.0F);
        fronda2.addChild(fronda3);


        cube_r10 = new AdvancedModelRenderer(this);
        cube_r10.setRotationPoint(0.0F, 3.0F, 0.0F);
        fronda3.addChild(cube_r10);
        setRotateAngle(cube_r10, 0.0F, -0.3927F, 0.0F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 1, -1.5F, -4.0F, 0.0F, 3, 1, 0, 0.0F, false));

        fronda4 = new AdvancedModelRenderer(this);
        fronda4.setRotationPoint(0.0F, -1.0F, 0.0F);
        fronda3.addChild(fronda4);


        cube_r11 = new AdvancedModelRenderer(this);
        cube_r11.setRotationPoint(0.0F, 4.0F, 0.0F);
        fronda4.addChild(cube_r11);
        setRotateAngle(cube_r11, 0.0F, -0.3927F, 0.0F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 6, 0, -1.5F, -5.0F, 0.0F, 3, 1, 0, 0.0F, false));

        fronda5 = new AdvancedModelRenderer(this);
        fronda5.setRotationPoint(0.0F, -1.0F, 0.0F);
        fronda4.addChild(fronda5);


        cube_r12 = new AdvancedModelRenderer(this);
        cube_r12.setRotationPoint(0.0F, 5.0F, 0.0F);
        fronda5.addChild(cube_r12);
        setRotateAngle(cube_r12, 0.0F, -0.3927F, 0.0F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 6, -1.5F, -6.0F, 0.0F, 3, 1, 0, 0.0F, false));

        fronda6 = new AdvancedModelRenderer(this);
        fronda6.setRotationPoint(0.0F, -1.0F, 0.0F);
        fronda5.addChild(fronda6);


        cube_r13 = new AdvancedModelRenderer(this);
        cube_r13.setRotationPoint(0.0F, 6.0F, 0.0F);
        fronda6.addChild(cube_r13);
        setRotateAngle(cube_r13, 0.0F, -0.3927F, 0.0F);
        cube_r13.cubeList.add(new ModelBox(cube_r13, 5, 3, -1.5F, -7.0F, 0.0F, 3, 1, 0, 0.0F, false));

        fronda7 = new AdvancedModelRenderer(this);
        fronda7.setRotationPoint(0.0F, -1.0F, 0.0F);
        fronda6.addChild(fronda7);


        cube_r14 = new AdvancedModelRenderer(this);
        cube_r14.setRotationPoint(0.0F, 7.0F, 0.0F);
        fronda7.addChild(cube_r14);
        setRotateAngle(cube_r14, 0.0F, -0.3927F, 0.0F);
        cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 5, -1.5F, -8.0F, 0.0F, 3, 1, 0, 0.0F, false));

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
