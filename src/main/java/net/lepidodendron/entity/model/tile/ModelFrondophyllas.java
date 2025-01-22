package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelFrondophyllas extends AdvancedModelBase {
    private final AdvancedModelRenderer Frondophyllas;
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer stem1;
    private final AdvancedModelRenderer frond1;
    private final AdvancedModelRenderer bb_main_r1;
    private final AdvancedModelRenderer frond2;
    private final AdvancedModelRenderer bb_main_r2;
    private final AdvancedModelRenderer frond3;
    private final AdvancedModelRenderer bb_main_r3;
    private final AdvancedModelRenderer frond4;
    private final AdvancedModelRenderer bb_main_r4;
    private final AdvancedModelRenderer frond5;
    private final AdvancedModelRenderer bb_main_r5;
    private final AdvancedModelRenderer frond6;
    private final AdvancedModelRenderer bb_main_r6;
    private final AdvancedModelRenderer stem2;
    private final AdvancedModelRenderer frond9;
    private final AdvancedModelRenderer bb_main_r7;
    private final AdvancedModelRenderer frond10;
    private final AdvancedModelRenderer bb_main_r8;
    private final AdvancedModelRenderer frond11;
    private final AdvancedModelRenderer bb_main_r9;
    private final AdvancedModelRenderer frond12;
    private final AdvancedModelRenderer bb_main_r10;
    private final AdvancedModelRenderer frond14;
    private final AdvancedModelRenderer bb_main_r11;
    private final AdvancedModelRenderer frond15;
    private final AdvancedModelRenderer bb_main_r12;
    private final AdvancedModelRenderer stem3;
    private final AdvancedModelRenderer frond16;
    private final AdvancedModelRenderer bb_main_r13;
    private final AdvancedModelRenderer frond17;
    private final AdvancedModelRenderer bb_main_r14;
    private final AdvancedModelRenderer frond18;
    private final AdvancedModelRenderer bb_main_r15;
    private final AdvancedModelRenderer frond19;
    private final AdvancedModelRenderer bb_main_r16;
    private final AdvancedModelRenderer frond20;
    private final AdvancedModelRenderer bb_main_r17;
    private final AdvancedModelRenderer frond21;
    private final AdvancedModelRenderer bb_main_r18;
    private final AdvancedModelRenderer frond22;
    private final AdvancedModelRenderer bb_main_r19;
    private final AdvancedModelRenderer frond23;
    private final AdvancedModelRenderer bb_main_r20;

    public ModelFrondophyllas() {
        textureWidth = 64;
        textureHeight = 64;

        Frondophyllas = new AdvancedModelRenderer(this);
        Frondophyllas.setRotationPoint(0.0F, 24.4F, 0.5F);


        base = new AdvancedModelRenderer(this);
        base.setRotationPoint(0.0F, -0.4F, -0.5F);
        Frondophyllas.addChild(base);
        base.cubeList.add(new ModelBox(base, 4, 0, -1.5F, -6.0F, -1.5F, 3, 6, 3, 0.0F, false));

        stem1 = new AdvancedModelRenderer(this);
        stem1.setRotationPoint(0.0F, -6.0F, 0.0F);
        base.addChild(stem1);
        stem1.cubeList.add(new ModelBox(stem1, 0, 16, -1.0F, -15.5F, -1.0F, 2, 16, 2, 0.0F, false));

        frond1 = new AdvancedModelRenderer(this);
        frond1.setRotationPoint(-1.0F, -0.3F, 0.0F);
        stem1.addChild(frond1);


        bb_main_r1 = new AdvancedModelRenderer(this);
        bb_main_r1.setRotationPoint(0.5F, -0.2F, 0.0F);
        frond1.addChild(bb_main_r1);
        setRotateAngle(bb_main_r1, 3.1416F, 0.0F, 2.0944F);
        bb_main_r1.cubeList.add(new ModelBox(bb_main_r1, 18, 44, -2.0F, -8.5F, 0.0F, 5, 9, 0, 0.0F, false));

        frond2 = new AdvancedModelRenderer(this);
        frond2.setRotationPoint(1.0F, -1.5F, 0.0F);
        stem1.addChild(frond2);


        bb_main_r2 = new AdvancedModelRenderer(this);
        bb_main_r2.setRotationPoint(-0.5F, -1.5F, 0.0F);
        frond2.addChild(bb_main_r2);
        setRotateAngle(bb_main_r2, 0.0F, 0.0F, 1.0472F);
        bb_main_r2.cubeList.add(new ModelBox(bb_main_r2, 18, 44, -1.0F, -8.0F, 0.0F, 5, 9, 0, 0.0F, false));

        frond3 = new AdvancedModelRenderer(this);
        frond3.setRotationPoint(-1.0F, -6.5F, 0.0F);
        stem1.addChild(frond3);


        bb_main_r3 = new AdvancedModelRenderer(this);
        bb_main_r3.setRotationPoint(0.5F, -0.25F, 0.0F);
        frond3.addChild(bb_main_r3);
        setRotateAngle(bb_main_r3, 3.1416F, 0.0F, 2.0944F);
        bb_main_r3.cubeList.add(new ModelBox(bb_main_r3, 8, 44, -2.0F, -8.5F, 0.0F, 5, 9, 0, 0.0F, false));

        frond4 = new AdvancedModelRenderer(this);
        frond4.setRotationPoint(1.0F, -7.8F, 0.0F);
        stem1.addChild(frond4);


        bb_main_r4 = new AdvancedModelRenderer(this);
        bb_main_r4.setRotationPoint(-0.5F, -1.45F, 0.0F);
        frond4.addChild(bb_main_r4);
        setRotateAngle(bb_main_r4, 0.0F, 0.0F, 1.0472F);
        bb_main_r4.cubeList.add(new ModelBox(bb_main_r4, 8, 44, -1.0F, -8.0F, 0.0F, 5, 9, 0, 0.0F, false));

        frond5 = new AdvancedModelRenderer(this);
        frond5.setRotationPoint(-1.0F, -12.7F, 0.0F);
        stem1.addChild(frond5);


        bb_main_r5 = new AdvancedModelRenderer(this);
        bb_main_r5.setRotationPoint(0.7F, -0.2F, 0.0F);
        frond5.addChild(bb_main_r5);
        setRotateAngle(bb_main_r5, 3.1416F, 0.0F, 2.0944F);
        bb_main_r5.cubeList.add(new ModelBox(bb_main_r5, 8, 36, -2.0F, -7.5F, 0.0F, 5, 8, 0, 0.0F, false));

        frond6 = new AdvancedModelRenderer(this);
        frond6.setRotationPoint(1.0F, -14.0F, 0.0F);
        stem1.addChild(frond6);


        bb_main_r6 = new AdvancedModelRenderer(this);
        bb_main_r6.setRotationPoint(-0.5F, -0.9F, 0.0F);
        frond6.addChild(bb_main_r6);
        setRotateAngle(bb_main_r6, 0.0F, 0.0F, 1.0472F);
        bb_main_r6.cubeList.add(new ModelBox(bb_main_r6, 8, 20, -1.5F, -7.0F, 0.0F, 5, 8, 0, 0.0F, false));

        stem2 = new AdvancedModelRenderer(this);
        stem2.setRotationPoint(0.0F, -15.5F, 0.0F);
        stem1.addChild(stem2);
        stem2.cubeList.add(new ModelBox(stem2, 0, 34, -1.0F, -16.0F, -1.0F, 2, 16, 2, -0.001F, false));

        frond9 = new AdvancedModelRenderer(this);
        frond9.setRotationPoint(-1.0F, -3.5F, 0.0F);
        stem2.addChild(frond9);


        bb_main_r7 = new AdvancedModelRenderer(this);
        bb_main_r7.setRotationPoint(0.7F, -0.15F, 0.0F);
        frond9.addChild(bb_main_r7);
        setRotateAngle(bb_main_r7, 3.1416F, 0.0F, 2.0944F);
        bb_main_r7.cubeList.add(new ModelBox(bb_main_r7, 8, 28, -2.0F, -7.5F, 0.0F, 5, 8, 0, 0.0F, false));

        frond10 = new AdvancedModelRenderer(this);
        frond10.setRotationPoint(1.0F, -4.8F, 0.0F);
        stem2.addChild(frond10);


        bb_main_r8 = new AdvancedModelRenderer(this);
        bb_main_r8.setRotationPoint(-0.5F, -0.85F, 0.0F);
        frond10.addChild(bb_main_r8);
        setRotateAngle(bb_main_r8, 0.0F, 0.0F, 1.0472F);
        bb_main_r8.cubeList.add(new ModelBox(bb_main_r8, 8, 28, -1.5F, -7.0F, 0.0F, 5, 8, 0, 0.0F, false));

        frond11 = new AdvancedModelRenderer(this);
        frond11.setRotationPoint(-1.0F, -8.6F, 0.0F);
        stem2.addChild(frond11);


        bb_main_r9 = new AdvancedModelRenderer(this);
        bb_main_r9.setRotationPoint(0.3F, -0.4F, 0.0F);
        frond11.addChild(bb_main_r9);
        setRotateAngle(bb_main_r9, 3.1416F, 0.0F, 2.0944F);
        bb_main_r9.cubeList.add(new ModelBox(bb_main_r9, 16, 7, -1.0F, -6.0F, 0.0F, 3, 7, 0, 0.0F, false));

        frond12 = new AdvancedModelRenderer(this);
        frond12.setRotationPoint(1.0F, -9.85F, 0.0F);
        stem2.addChild(frond12);


        bb_main_r10 = new AdvancedModelRenderer(this);
        bb_main_r10.setRotationPoint(-0.3F, -0.45F, 0.0F);
        frond12.addChild(bb_main_r10);
        setRotateAngle(bb_main_r10, 0.0F, 0.0F, 1.0472F);
        bb_main_r10.cubeList.add(new ModelBox(bb_main_r10, 16, 7, -1.0F, -6.0F, 0.0F, 3, 7, 0, 0.0F, false));

        frond14 = new AdvancedModelRenderer(this);
        frond14.setRotationPoint(-1.0F, -12.6F, 0.0F);
        stem2.addChild(frond14);


        bb_main_r11 = new AdvancedModelRenderer(this);
        bb_main_r11.setRotationPoint(0.3F, -0.35F, 0.0F);
        frond14.addChild(bb_main_r11);
        setRotateAngle(bb_main_r11, 3.1416F, 0.0F, 2.0944F);
        bb_main_r11.cubeList.add(new ModelBox(bb_main_r11, 16, 0, -1.0F, -6.0F, 0.0F, 3, 7, 0, 0.0F, false));

        frond15 = new AdvancedModelRenderer(this);
        frond15.setRotationPoint(1.0F, -13.85F, 0.0F);
        stem2.addChild(frond15);


        bb_main_r12 = new AdvancedModelRenderer(this);
        bb_main_r12.setRotationPoint(-0.3F, -0.4F, 0.0F);
        frond15.addChild(bb_main_r12);
        setRotateAngle(bb_main_r12, 0.0F, 0.0F, 1.0472F);
        bb_main_r12.cubeList.add(new ModelBox(bb_main_r12, 16, 0, -1.0F, -6.0F, 0.0F, 3, 7, 0, 0.0F, false));

        stem3 = new AdvancedModelRenderer(this);
        stem3.setRotationPoint(0.0F, -16.0F, 0.0F);
        stem2.addChild(stem3);
        stem3.cubeList.add(new ModelBox(stem3, 0, 0, -0.5F, -15.0F, -0.5F, 1, 15, 1, -0.002F, false));

        frond16 = new AdvancedModelRenderer(this);
        frond16.setRotationPoint(-0.5F, -0.1F, 0.0F);
        stem3.addChild(frond16);


        bb_main_r13 = new AdvancedModelRenderer(this);
        bb_main_r13.setRotationPoint(0.0F, -0.7F, 0.0F);
        frond16.addChild(bb_main_r13);
        setRotateAngle(bb_main_r13, 3.1416F, 0.0F, 2.0944F);
        bb_main_r13.cubeList.add(new ModelBox(bb_main_r13, 14, 14, -1.0F, -5.0F, 0.0F, 3, 6, 0, 0.0F, false));

        frond17 = new AdvancedModelRenderer(this);
        frond17.setRotationPoint(0.5F, -1.35F, 0.0F);
        stem3.addChild(frond17);


        bb_main_r14 = new AdvancedModelRenderer(this);
        bb_main_r14.setRotationPoint(-0.5F, -0.45F, 0.0F);
        frond17.addChild(bb_main_r14);
        setRotateAngle(bb_main_r14, 0.0F, 0.0F, 1.0472F);
        bb_main_r14.cubeList.add(new ModelBox(bb_main_r14, 14, 14, -1.0F, -5.5F, 0.0F, 3, 6, 0, 0.0F, false));

        frond18 = new AdvancedModelRenderer(this);
        frond18.setRotationPoint(-0.5F, -4.1F, 0.0F);
        stem3.addChild(frond18);


        bb_main_r15 = new AdvancedModelRenderer(this);
        bb_main_r15.setRotationPoint(0.1F, -0.65F, 0.0F);
        frond18.addChild(bb_main_r15);
        setRotateAngle(bb_main_r15, 3.1416F, 0.0F, 2.0944F);
        bb_main_r15.cubeList.add(new ModelBox(bb_main_r15, 8, 14, -1.0F, -5.0F, 0.0F, 3, 6, 0, 0.0F, false));

        frond19 = new AdvancedModelRenderer(this);
        frond19.setRotationPoint(0.5F, -5.6F, 0.0F);
        stem3.addChild(frond19);


        bb_main_r16 = new AdvancedModelRenderer(this);
        bb_main_r16.setRotationPoint(-0.6F, -0.15F, 0.0F);
        frond19.addChild(bb_main_r16);
        setRotateAngle(bb_main_r16, 0.0F, 0.0F, 1.0472F);
        bb_main_r16.cubeList.add(new ModelBox(bb_main_r16, 8, 14, -1.0F, -5.5F, 0.0F, 3, 6, 0, 0.0F, false));

        frond20 = new AdvancedModelRenderer(this);
        frond20.setRotationPoint(-0.5F, -8.1F, 0.0F);
        stem3.addChild(frond20);


        bb_main_r17 = new AdvancedModelRenderer(this);
        bb_main_r17.setRotationPoint(0.1F, -0.6F, 0.0F);
        frond20.addChild(bb_main_r17);
        setRotateAngle(bb_main_r17, 3.1416F, 0.0F, 2.0944F);
        bb_main_r17.cubeList.add(new ModelBox(bb_main_r17, 4, 9, -1.0F, -4.0F, 0.0F, 3, 5, 0, 0.0F, false));

        frond21 = new AdvancedModelRenderer(this);
        frond21.setRotationPoint(0.5F, -9.35F, 0.0F);
        stem3.addChild(frond21);


        bb_main_r18 = new AdvancedModelRenderer(this);
        bb_main_r18.setRotationPoint(-0.1F, -0.65F, 0.0F);
        frond21.addChild(bb_main_r18);
        setRotateAngle(bb_main_r18, 0.0F, 0.0F, 1.0472F);
        bb_main_r18.cubeList.add(new ModelBox(bb_main_r18, 10, 9, -1.0F, -4.0F, 0.0F, 3, 5, 0, 0.0F, false));

        frond22 = new AdvancedModelRenderer(this);
        frond22.setRotationPoint(-0.5F, -12.1F, 0.0F);
        stem3.addChild(frond22);


        bb_main_r19 = new AdvancedModelRenderer(this);
        bb_main_r19.setRotationPoint(0.1F, -0.55F, 0.0F);
        frond22.addChild(bb_main_r19);
        setRotateAngle(bb_main_r19, 3.1416F, 0.0F, 2.0944F);
        bb_main_r19.cubeList.add(new ModelBox(bb_main_r19, 10, 9, -1.0F, -4.0F, 0.0F, 3, 5, 0, 0.0F, false));

        frond23 = new AdvancedModelRenderer(this);
        frond23.setRotationPoint(0.5F, -13.35F, 0.0F);
        stem3.addChild(frond23);


        bb_main_r20 = new AdvancedModelRenderer(this);
        bb_main_r20.setRotationPoint(-0.1F, -0.6F, 0.0F);
        frond23.addChild(bb_main_r20);
        setRotateAngle(bb_main_r20, 0.0F, 0.0F, 1.0472F);
        bb_main_r20.cubeList.add(new ModelBox(bb_main_r20, 10, 9, -1.0F, -4.0F, 0.0F, 3, 5, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        AdvancedModelRenderer[] bodyFull = {this.stem1,this.stem2,this.stem3};
        float speed = 0.091F;
        this.chainWave(bodyFull, speed, 0.09F, 2, f, 0.42F);
        frond1.flap(speed, 0.05F, false,0, 0, f, 0.42F);
        frond2.flap(speed, 0.05F, true,0, 0, f, 0.42F);
        frond1.swing(speed * 0.5F, 0.26F, false,0, 0, f, 0.42F);
        frond2.swing(speed * 0.5F, 0.26F, true,0, 0, f, 0.42F);

        frond3.flap(speed, 0.05F, false,0.3F, 0, f, 0.42F);
        frond4.flap(speed, 0.05F, true,0.3F, 0, f, 0.42F);
        frond3.swing(speed * 0.5F, 0.26F, false,0.3F, 0, f, 0.42F);
        frond4.swing(speed * 0.5F, 0.26F, true,0.3F, 0, f, 0.42F);

        frond5.flap(speed, 0.05F, false,0.6F, 0, f, 0.42F);
        frond6.flap(speed, 0.05F, true,0.6F, 0, f, 0.42F);
        frond5.swing(speed * 0.5F, 0.26F, false,0.6F, 0, f, 0.42F);
        frond6.swing(speed * 0.5F, 0.26F, true,0.6F, 0, f, 0.42F);

        frond9.flap(speed, 0.05F, false,0.9F, 0, f, 0.42F);
        frond10.flap(speed, 0.05F, true,0.9F, 0, f, 0.42F);
        frond9.swing(speed * 0.5F, 0.26F, false,0.9F, 0, f, 0.42F);
        frond10.swing(speed * 0.5F, 0.26F, true,0.9F, 0, f, 0.42F);

        frond11.flap(speed, 0.05F, false,1.2F, 0, f, 0.42F);
        frond12.flap(speed, 0.05F, true,1.2F, 0, f, 0.42F);
        frond11.swing(speed * 0.5F, 0.26F, false,1.2F, 0, f, 0.42F);
        frond12.swing(speed * 0.5F, 0.26F, true,1.2F, 0, f, 0.42F);

        frond14.flap(speed, 0.05F, false,1.5F, 0, f, 0.42F);
        frond15.flap(speed, 0.05F, true,1.5F, 0, f, 0.42F);
        frond14.swing(speed * 0.5F, 0.26F, false,1.5F, 0, f, 0.42F);
        frond15.swing(speed * 0.5F, 0.26F, true,1.5F, 0, f, 0.42F);

        frond16.flap(speed, 0.05F, false,1.8F, 0, f, 0.42F);
        frond17.flap(speed, 0.05F, true,1.8F, 0, f, 0.42F);
        frond16.swing(speed * 0.5F, 0.26F, false,1.8F, 0, f, 0.42F);
        frond17.swing(speed * 0.5F, 0.26F, true,1.8F, 0, f, 0.42F);

        frond18.flap(speed, 0.05F, false,2.1F, 0, f, 0.42F);
        frond19.flap(speed, 0.05F, true,2.1F, 0, f, 0.42F);
        frond18.swing(speed * 0.5F, 0.26F, false,2.1F, 0, f, 0.42F);
        frond19.swing(speed * 0.5F, 0.26F, true,2.1F, 0, f, 0.42F);

        frond20.flap(speed, 0.05F, false,2.1F, 0, f, 0.42F);
        frond21.flap(speed, 0.05F, true,2.1F, 0, f, 0.42F);
        frond20.swing(speed * 0.5F, 0.26F, false,2.1F, 0, f, 0.42F);
        frond21.swing(speed * 0.5F, 0.26F, true,2.1F, 0, f, 0.42F);

        frond22.flap(speed, 0.05F, false,2.4F, 0, f, 0.42F);
        frond23.flap(speed, 0.05F, true,2.4F, 0, f, 0.42F);
        frond22.swing(speed * 0.5F, 0.26F, false,2.4F, 0, f, 0.42F);
        frond23.swing(speed * 0.5F, 0.26F, true,2.4F, 0, f, 0.42F);

        this.Frondophyllas.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
