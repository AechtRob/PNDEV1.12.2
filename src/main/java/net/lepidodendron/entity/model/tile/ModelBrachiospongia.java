package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelBrachiospongia extends AdvancedModelBase {
    private final AdvancedModelRenderer Brachiospongia;
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
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer cube_r20;

    public ModelBrachiospongia() {
        textureWidth = 16;
        textureHeight = 16;

        Brachiospongia = new AdvancedModelRenderer(this);
        Brachiospongia.setRotationPoint(0.0F, 24.0F, 0.0F);
        Brachiospongia.cubeList.add(new ModelBox(Brachiospongia, 0, 0, -1.5F, -2.05F, -1.5F, 3, 1, 3, 0.09F, false));
        Brachiospongia.cubeList.add(new ModelBox(Brachiospongia, 6, 8, -2.5F, -2.0F, -0.5F, 1, 1, 1, 0.0F, false));
        Brachiospongia.cubeList.add(new ModelBox(Brachiospongia, 6, 8, 1.5273F, -2.0F, -0.5F, 1, 1, 1, 0.0F, true));
        Brachiospongia.cubeList.add(new ModelBox(Brachiospongia, 0, 4, -1.5F, -3.075F, -1.5F, 3, 1, 3, 0.1F, false));

        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(-1.1682F, -1.0F, -1.0307F);
        Brachiospongia.addChild(cube_r1);
        setRotateAngle(cube_r1, 0.0F, -0.3927F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 8, 3.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(-0.6838F, -1.0F, -1.4045F);
        Brachiospongia.addChild(cube_r2);
        setRotateAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 8, 3.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(-0.0932F, -1.0F, -1.5645F);
        Brachiospongia.addChild(cube_r3);
        setRotateAngle(cube_r3, 0.0F, -1.1781F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 8, 3.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        cube_r4 = new AdvancedModelRenderer(this);
        cube_r4.setRotationPoint(-4.4863F, -1.0F, 0.5137F);
        Brachiospongia.addChild(cube_r4);
        setRotateAngle(cube_r4, 0.0F, 1.5708F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 8, -2.0F, -1.0F, 4.0F, 1, 1, 1, 0.0F, false));

        cube_r5 = new AdvancedModelRenderer(this);
        cube_r5.setRotationPoint(0.1205F, -1.0F, -1.5645F);
        Brachiospongia.addChild(cube_r5);
        setRotateAngle(cube_r5, 0.0F, 1.1781F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 8, -4.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        cube_r6 = new AdvancedModelRenderer(this);
        cube_r6.setRotationPoint(0.7111F, -1.0F, -1.4045F);
        Brachiospongia.addChild(cube_r6);
        setRotateAngle(cube_r6, 0.0F, 0.7854F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 8, -4.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        cube_r7 = new AdvancedModelRenderer(this);
        cube_r7.setRotationPoint(1.1955F, -1.0F, -1.0307F);
        Brachiospongia.addChild(cube_r7);
        setRotateAngle(cube_r7, 0.0F, 0.3927F, 0.0F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 8, -4.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        cube_r8 = new AdvancedModelRenderer(this);
        cube_r8.setRotationPoint(0.1205F, -1.0F, 1.5645F);
        Brachiospongia.addChild(cube_r8);
        setRotateAngle(cube_r8, 0.0F, -1.1781F, 0.0F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 8, -4.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        cube_r9 = new AdvancedModelRenderer(this);
        cube_r9.setRotationPoint(-1.1682F, -1.0F, 1.0307F);
        Brachiospongia.addChild(cube_r9);
        setRotateAngle(cube_r9, 0.0F, 0.3927F, 0.0F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 8, 3.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        cube_r10 = new AdvancedModelRenderer(this);
        cube_r10.setRotationPoint(-0.6838F, -1.0F, 1.4045F);
        Brachiospongia.addChild(cube_r10);
        setRotateAngle(cube_r10, 0.0F, 0.7854F, 0.0F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 8, 3.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        cube_r11 = new AdvancedModelRenderer(this);
        cube_r11.setRotationPoint(-0.0932F, -1.0F, 1.5645F);
        Brachiospongia.addChild(cube_r11);
        setRotateAngle(cube_r11, 0.0F, 1.1781F, 0.0F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 6, 8, 3.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        cube_r12 = new AdvancedModelRenderer(this);
        cube_r12.setRotationPoint(0.7111F, -1.0F, 1.4045F);
        Brachiospongia.addChild(cube_r12);
        setRotateAngle(cube_r12, 0.0F, -0.7854F, 0.0F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 6, 8, -4.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        cube_r13 = new AdvancedModelRenderer(this);
        cube_r13.setRotationPoint(1.1955F, -1.0F, 1.0307F);
        Brachiospongia.addChild(cube_r13);
        setRotateAngle(cube_r13, 0.0F, -0.3927F, 0.0F);
        cube_r13.cubeList.add(new ModelBox(cube_r13, 6, 8, -4.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        cube_r14 = new AdvancedModelRenderer(this);
        cube_r14.setRotationPoint(-2.4863F, -1.0F, -0.5137F);
        Brachiospongia.addChild(cube_r14);
        setRotateAngle(cube_r14, 0.0F, -1.5708F, 0.0F);
        cube_r14.cubeList.add(new ModelBox(cube_r14, 6, 8, -2.0F, -1.0F, -3.0F, 1, 1, 1, 0.0F, false));

        bone = new AdvancedModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r15 = new AdvancedModelRenderer(this);
        cube_r15.setRotationPoint(-2.325F, -0.65F, 0.5F);
        bone.addChild(cube_r15);
        setRotateAngle(cube_r15, 0.0F, 0.0F, 0.7418F);
        cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 8, -2.0F, -1.0F, -1.5F, 2, 3, 2, 0.0F, false));

        bone2 = new AdvancedModelRenderer(this);
        bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
        setRotateAngle(bone2, 0.0F, -1.0472F, 0.0F);


        cube_r16 = new AdvancedModelRenderer(this);
        cube_r16.setRotationPoint(-2.325F, -0.65F, 0.5F);
        bone2.addChild(cube_r16);
        setRotateAngle(cube_r16, 0.0F, 0.0F, 0.7418F);
        cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 8, -2.0F, -1.0F, -1.5F, 2, 3, 2, 0.0F, false));

        bone3 = new AdvancedModelRenderer(this);
        bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
        setRotateAngle(bone3, 0.0F, -2.0944F, 0.0F);


        cube_r17 = new AdvancedModelRenderer(this);
        cube_r17.setRotationPoint(-2.325F, -0.65F, 0.5F);
        bone3.addChild(cube_r17);
        setRotateAngle(cube_r17, 0.0F, 0.0F, 0.7418F);
        cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 8, -2.0F, -1.0F, -1.5F, 2, 3, 2, 0.0F, false));

        bone4 = new AdvancedModelRenderer(this);
        bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
        setRotateAngle(bone4, 0.0F, 3.1416F, 0.0F);


        cube_r18 = new AdvancedModelRenderer(this);
        cube_r18.setRotationPoint(-2.325F, -0.65F, 0.5F);
        bone4.addChild(cube_r18);
        setRotateAngle(cube_r18, 0.0F, 0.0F, 0.7418F);
        cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 8, -2.0F, -1.0F, -1.5F, 2, 3, 2, 0.0F, false));

        bone5 = new AdvancedModelRenderer(this);
        bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
        setRotateAngle(bone5, 0.0F, 2.0944F, 0.0F);


        cube_r19 = new AdvancedModelRenderer(this);
        cube_r19.setRotationPoint(-2.325F, -0.65F, 0.5F);
        bone5.addChild(cube_r19);
        setRotateAngle(cube_r19, 0.0F, 0.0F, 0.7418F);
        cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 8, -2.0F, -1.0F, -1.5F, 2, 3, 2, 0.0F, false));

        bone6 = new AdvancedModelRenderer(this);
        bone6.setRotationPoint(0.0F, 24.0F, 0.0F);
        setRotateAngle(bone6, 0.0F, 1.0472F, 0.0F);


        cube_r20 = new AdvancedModelRenderer(this);
        cube_r20.setRotationPoint(-2.325F, -0.65F, 0.5F);
        bone6.addChild(cube_r20);
        setRotateAngle(cube_r20, 0.0F, 0.0F, 0.7418F);
        cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 8, -2.0F, -1.0F, -1.5F, 2, 3, 2, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        Brachiospongia.render(0.1f);
        bone.render(0.1f);
        bone2.render(0.1f);
        bone3.render(0.1f);
        bone4.render(0.1f);
        bone5.render(0.1f);
        bone6.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
