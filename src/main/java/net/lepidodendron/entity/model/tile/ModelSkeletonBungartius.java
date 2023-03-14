package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBungartius extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;

    public ModelSkeletonBungartius() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 17.75F, -10.5F);
        this.body.cubeList.add(new ModelBox(body, 22, 32, 3.0F, -6.75F, 10.5F, 1, 4, 4, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, 3.0F, -2.75F, 10.5F, 1, 4, 2, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 32, -4.0F, -6.75F, 10.5F, 1, 4, 4, -0.01F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -2.75F, 10.5F, 1, 4, 2, -0.01F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 1.25F, 10.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0785F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 13, -1.5F, -1.0F, 4.0F, 4, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 0, -2.5F, -1.0F, 0.0F, 6, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.6538F, 19.4038F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0087F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 27, -1.0F, -0.704F, 0.092F, 2, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -6.9844F, 16.5139F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1134F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 10, 0.0F, 0.6045F, -3.0055F, 0, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -6.75F, 10.5F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 6, -0.5F, 0.0F, 4.0F, 2, 1, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 32, -2.5F, 0.0F, -1.0F, 1, 1, 5, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 32, 2.5F, 0.0F, -1.0F, 1, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 28, -1.5F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.75F, 10.5F);
        this.body.addChild(head);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.75F, -5.5F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5149F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 13, -1.0F, -1.025F, -5.85F, 2, 2, 1, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.75F, -5.5F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.288F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 39, -1.0F, 0.1F, -5.0F, 2, 1, 3, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 20, -1.5F, 0.1F, -2.0F, 3, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.9F, 1.25F, -4.5F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.7854F, 0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 10, -0.96F, 2.5F, -3.95F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.0F, 1.25F, -4.5F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1527F, 0.2749F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 13, -1.35F, -3.225F, -5.75F, 1, 2, 7, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.9F, 1.25F, -4.5F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2007F, -0.1745F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 37, 0.95F, 0.3F, -6.4F, 0, 1, 4, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.9F, 1.25F, -4.5F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2007F, 0.1745F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 37, -0.95F, 0.3F, -6.4F, 0, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(3.0F, 1.275F, -4.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2007F, 0.2793F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 3, -1.351F, -1.2F, -6.0F, 1, 2, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.0F, 1.275F, -4.5F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2007F, -0.2793F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.351F, -1.2F, -6.0F, 1, 2, 7, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.0F, 1.25F, -4.5F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1527F, -0.2749F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 10, 0.35F, -3.225F, -5.75F, 1, 2, 7, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.9F, 1.25F, -4.5F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.7854F, -0.1745F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 10, 0, 0.96F, 2.5F, -3.95F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 27, 6, -2.0F, 7.0F, -3.35F, 4, 1, 4, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(3.0F, 0.0F, -4.5F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.1745F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 20, -1.0F, -2.5F, 0.0F, 1, 6, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.0F, 0.0F, -4.5F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, -0.1745F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 20, 0.0F, -2.5F, 0.0F, 1, 6, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 12, -2.0F, 0.0F, -5.0F, 4, 1, 2, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 23, -3.0F, 0.0F, -5.0F, 1, 1, 3, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 23, 2.0F, 0.0F, -5.0F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.75F, -3.75F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2618F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, 0.25F, -6.75F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.2443F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 40, 3, -1.5F, -0.25F, 4.0F, 1, 2, 3, -0.01F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 35, -1.5F, -0.25F, 0.0F, 1, 1, 4, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, 0.25F, -6.75F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2182F, 0.2443F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 33, 34, -1.5F, -0.25F, 0.3F, 1, 1, 4, -0.014F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 1.75F, -3.75F);
        this.head.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.2618F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.jaw2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1222F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 10, 0, 0.0F, -0.15F, -1.75F, 0, 1, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 0.25F, -6.75F);
        this.jaw2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.2443F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 40, 3, 0.5F, -0.25F, 4.0F, 1, 2, 3, -0.01F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 35, 0.5F, -0.25F, 0.0F, 1, 1, 4, -0.01F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, 0.25F, -6.75F);
        this.jaw2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2182F, -0.2443F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 33, 34, 0.5F, -0.25F, 0.3F, 1, 1, 4, -0.014F, true));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.body.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
