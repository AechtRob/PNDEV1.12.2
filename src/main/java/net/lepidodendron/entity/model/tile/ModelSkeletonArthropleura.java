package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonArthropleura extends AdvancedModelBase {
    private final AdvancedModelRenderer Arthropleura;
    private final AdvancedModelRenderer FrontSegment3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer FrontSegment4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer HeadSegment;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Leg1;
    private final AdvancedModelRenderer FrontSegment2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Back2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Back;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Leg2;
    private final AdvancedModelRenderer BackSegment1;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Leg3;
    private final AdvancedModelRenderer Leg4;
    private final AdvancedModelRenderer BackSegment2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer BackSegment3;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;

    public ModelSkeletonArthropleura() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Arthropleura = new AdvancedModelRenderer(this);
        this.Arthropleura.setRotationPoint(0.5F, 22.5F, -31.25F);
        this.Arthropleura.cubeList.add(new ModelBox(Arthropleura, 0, 0, -15.0F, 0.25F, -16.0F, 16, 1, 16, -0.01F, false));
        this.Arthropleura.cubeList.add(new ModelBox(Arthropleura, 0, 0, -5.0F, 0.25F, -13.0F, 16, 1, 16, 0.0F, false));
        this.Arthropleura.cubeList.add(new ModelBox(Arthropleura, 0, 0, -2.0F, 0.25F, 2.0F, 16, 1, 16, -0.01F, false));
        this.Arthropleura.cubeList.add(new ModelBox(Arthropleura, 0, 111, 0.0F, 0.25F, 18.0F, 16, 1, 16, 0.01F, false));
        this.Arthropleura.cubeList.add(new ModelBox(Arthropleura, 64, 111, -2.0F, 0.25F, 34.0F, 16, 1, 16, 0.0F, false));
        this.Arthropleura.cubeList.add(new ModelBox(Arthropleura, 0, 95, -4.0F, 0.25F, 49.0F, 16, 1, 16, -0.01F, false));
        this.Arthropleura.cubeList.add(new ModelBox(Arthropleura, 0, 95, -17.0F, 0.25F, 54.0F, 16, 1, 16, 0.0F, false));
        this.Arthropleura.cubeList.add(new ModelBox(Arthropleura, 64, 111, -16.0F, 0.25F, 38.0F, 16, 1, 16, 0.01F, false));
        this.Arthropleura.cubeList.add(new ModelBox(Arthropleura, 0, 111, -13.0F, 0.25F, 22.0F, 16, 1, 16, -0.01F, false));
        this.Arthropleura.cubeList.add(new ModelBox(Arthropleura, 0, 111, -14.0F, 0.25F, 7.0F, 16, 1, 16, 0.0F, false));
        this.Arthropleura.cubeList.add(new ModelBox(Arthropleura, 0, 0, -18.0F, 0.25F, -8.0F, 16, 1, 16, 0.01F, false));

        this.FrontSegment3 = new AdvancedModelRenderer(this);
        this.FrontSegment3.setRotationPoint(0.0F, 0.0F, 13.25F);
        this.Arthropleura.addChild(FrontSegment3);
        this.setRotateAngle(FrontSegment3, 0.0F, 0.1745F, 0.0F);
        this.FrontSegment3.cubeList.add(new ModelBox(FrontSegment3, 0, 10, -4.0F, -1.5F, -10.0F, 7, 2, 1, -0.002F, false));
        this.FrontSegment3.cubeList.add(new ModelBox(FrontSegment3, 27, 30, -5.0F, -1.5F, -9.0F, 9, 2, 9, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 2.5F, -4.4F);
        this.FrontSegment3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0344F, 0.0061F, -0.1308F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 43, 52, -7.263F, -4.1509F, -6.5035F, 5, 0, 11, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 2.5F, -4.4F);
        this.FrontSegment3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0323F, 0.0134F, -0.3489F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 63, 32, -9.1342F, -5.6061F, -4.5035F, 3, 0, 10, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.5F, -4.4F);
        this.FrontSegment3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0344F, -0.0061F, 0.1308F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 61, 2.263F, -3.9009F, -6.5035F, 5, 0, 11, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.5F, -4.4F);
        this.FrontSegment3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0323F, -0.0134F, 0.1308F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 64, 11, 6.1016F, -3.8538F, -4.4951F, 3, 0, 10, 0.0F, false));

        this.FrontSegment4 = new AdvancedModelRenderer(this);
        this.FrontSegment4.setRotationPoint(-0.5F, 0.0F, -9.0F);
        this.FrontSegment3.addChild(FrontSegment4);
        this.setRotateAngle(FrontSegment4, 0.0F, 0.2182F, 0.0F);
        this.FrontSegment4.cubeList.add(new ModelBox(FrontSegment4, 0, 50, -4.0F, -1.5F, -9.0F, 8, 2, 9, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.7F, -4.35F);
        this.FrontSegment4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0645F, 0.0267F, -0.3482F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 63, -9.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.7F, -4.35F);
        this.FrontSegment4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0688F, 0.0121F, -0.1305F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 39, -7.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.6F, -4.35F);
        this.FrontSegment4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0645F, -0.0267F, 0.1308F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 42, 6.1015F, -3.8535F, -4.4901F, 3, 0, 10, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.6F, -4.35F);
        this.FrontSegment4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0688F, -0.0121F, 0.1308F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 61, 2.263F, -3.9011F, -6.507F, 5, 0, 11, 0.0F, false));

        this.HeadSegment = new AdvancedModelRenderer(this);
        this.HeadSegment.setRotationPoint(0.0F, -0.5F, -8.6F);
        this.FrontSegment4.addChild(HeadSegment);
        this.setRotateAngle(HeadSegment, 0.0F, 0.1745F, 0.0F);
        this.HeadSegment.cubeList.add(new ModelBox(HeadSegment, 69, 67, -3.0F, -1.0F, -5.0F, 6, 2, 5, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 3.25F, -4.25F);
        this.HeadSegment.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0849F, 0.0187F, -0.1221F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 66, 0, -10.15F, -4.1F, -2.0F, 7, 0, 7, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 3.25F, -4.25F);
        this.HeadSegment.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0849F, -0.0187F, 0.1221F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 67, 52, 3.15F, -3.85F, -2.0F, 7, 0, 7, 0.0F, false));

        this.Leg1 = new AdvancedModelRenderer(this);
        this.Leg1.setRotationPoint(-3.0F, 0.5F, -8.25F);
        this.HeadSegment.addChild(Leg1);
        this.setRotateAngle(Leg1, 1.5708F, 0.0F, 0.0F);
        this.Leg1.cubeList.add(new ModelBox(Leg1, 0, 0, -5.0F, -0.5F, -0.1F, 5, 3, 0, 0.0F, false));

        this.FrontSegment2 = new AdvancedModelRenderer(this);
        this.FrontSegment2.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.FrontSegment3.addChild(FrontSegment2);
        this.setRotateAngle(FrontSegment2, 0.0F, -0.0873F, 0.0F);
        this.FrontSegment2.cubeList.add(new ModelBox(FrontSegment2, 0, 72, -4.0F, -1.5F, -1.0F, 8, 2, 1, -0.002F, false));
        this.FrontSegment2.cubeList.add(new ModelBox(FrontSegment2, 0, 28, -4.5F, -1.5F, 0.0F, 9, 2, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 2.5F, 4.6F);
        this.FrontSegment2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0323F, -0.0134F, 0.3489F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 45, 63, 6.1342F, -5.6061F, -4.5035F, 3, 0, 10, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 2.5F, 4.6F);
        this.FrontSegment2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0344F, -0.0061F, 0.1308F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 61, 2.263F, -4.1509F, -6.5035F, 5, 0, 11, 0.0F, false));

        this.Back2 = new AdvancedModelRenderer(this);
        this.Back2.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.FrontSegment2.addChild(Back2);
        this.setRotateAngle(Back2, 0.0F, -0.0873F, 0.0F);
        this.Back2.cubeList.add(new ModelBox(Back2, 0, 39, -4.5F, -1.5F, 0.0F, 9, 2, 9, 0.001F, false));
        this.Back2.cubeList.add(new ModelBox(Back2, 18, 73, -4.0F, -1.5F, -1.0F, 8, 2, 1, -0.002F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 2.5F, 4.6F);
        this.Back2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0344F, -0.0061F, 0.1308F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 53, 50, 2.263F, -4.1509F, -6.5035F, 5, 0, 11, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 2.5F, 4.6F);
        this.Back2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0323F, -0.0134F, 0.3489F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 39, 63, 6.1342F, -5.6061F, -4.5035F, 3, 0, 10, 0.0F, false));

        this.Back = new AdvancedModelRenderer(this);
        this.Back.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Back2.addChild(Back);
        this.setRotateAngle(Back, 0.0F, -0.1309F, 0.0F);
        this.Back.cubeList.add(new ModelBox(Back, 36, 73, -4.0F, -1.5F, -1.0F, 8, 2, 1, -0.002F, false));
        this.Back.cubeList.add(new ModelBox(Back, 27, 41, -4.5F, -1.5F, 0.0F, 9, 2, 9, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 2.5F, 4.6F);
        this.Back.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0344F, -0.0061F, 0.1308F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 53, 11, 2.263F, -4.1509F, -6.5035F, 5, 0, 11, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 2.5F, 4.6F);
        this.Back.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0323F, -0.0134F, 0.3489F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 33, 63, 6.1342F, -5.6061F, -4.5035F, 3, 0, 10, 0.0F, false));

        this.Leg2 = new AdvancedModelRenderer(this);
        this.Leg2.setRotationPoint(8.0F, 0.0F, 0.15F);
        this.Back.addChild(Leg2);
        this.setRotateAngle(Leg2, 1.5708F, 0.0F, 0.0F);
        this.Leg2.cubeList.add(new ModelBox(Leg2, 0, 79, 0.0F, -0.5F, -0.1F, 5, 3, 0, 0.0F, true));

        this.BackSegment1 = new AdvancedModelRenderer(this);
        this.BackSegment1.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Back.addChild(BackSegment1);
        this.setRotateAngle(BackSegment1, 0.0F, -0.1745F, 0.0F);
        this.BackSegment1.cubeList.add(new ModelBox(BackSegment1, 54, 74, -4.0F, -1.5F, -1.0F, 8, 2, 1, -0.002F, false));
        this.BackSegment1.cubeList.add(new ModelBox(BackSegment1, 27, 19, -4.5F, -1.5F, 0.0F, 9, 2, 9, 0.001F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 2.5F, 4.6F);
        this.BackSegment1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0344F, 0.0061F, -0.1308F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 23, 52, -7.263F, -4.1509F, -6.5035F, 5, 0, 11, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 2.5F, 4.6F);
        this.BackSegment1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0323F, 0.0134F, -0.3489F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 63, -9.1342F, -5.6061F, -4.5035F, 3, 0, 10, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 2.5F, 4.6F);
        this.BackSegment1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0344F, -0.0061F, 0.1308F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 33, 52, 2.263F, -4.1509F, -6.5035F, 5, 0, 11, 0.0F, false));

        this.Leg3 = new AdvancedModelRenderer(this);
        this.Leg3.setRotationPoint(8.0F, 0.0F, 2.15F);
        this.BackSegment1.addChild(Leg3);
        this.setRotateAngle(Leg3, 1.5708F, -0.1745F, 0.0F);
        this.Leg3.cubeList.add(new ModelBox(Leg3, 0, 82, 0.0F, -0.5F, -0.1F, 5, 3, 0, 0.0F, true));

        this.Leg4 = new AdvancedModelRenderer(this);
        this.Leg4.setRotationPoint(8.0F, 0.0F, 4.15F);
        this.BackSegment1.addChild(Leg4);
        this.setRotateAngle(Leg4, 1.5708F, -0.3491F, 0.0F);
        this.Leg4.cubeList.add(new ModelBox(Leg4, 0, 82, 0.0F, -0.5F, -0.1F, 5, 3, 0, 0.0F, true));

        this.BackSegment2 = new AdvancedModelRenderer(this);
        this.BackSegment2.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.BackSegment1.addChild(BackSegment2);
        this.setRotateAngle(BackSegment2, 0.0F, 0.1309F, 0.0F);
        this.BackSegment2.cubeList.add(new ModelBox(BackSegment2, 74, 59, -4.0F, -1.5F, -1.0F, 8, 2, 1, -0.002F, false));
        this.BackSegment2.cubeList.add(new ModelBox(BackSegment2, 0, 17, -4.5F, -1.5F, 0.0F, 9, 2, 9, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 2.5F, 4.6F);
        this.BackSegment2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0323F, 0.0134F, -0.3489F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, -9.1342F, -5.6061F, -4.5035F, 3, 0, 10, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 2.5F, 4.6F);
        this.BackSegment2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0344F, 0.0061F, -0.1308F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 43, 17, -7.263F, -4.1509F, -6.5035F, 5, 0, 11, 0.0F, false));

        this.BackSegment3 = new AdvancedModelRenderer(this);
        this.BackSegment3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.BackSegment2.addChild(BackSegment3);
        this.setRotateAngle(BackSegment3, 0.0F, 0.0436F, 0.0F);
        this.BackSegment3.cubeList.add(new ModelBox(BackSegment3, 0, 13, -3.5F, -1.5F, -1.0F, 7, 2, 1, -0.002F, false));
        this.BackSegment3.cubeList.add(new ModelBox(BackSegment3, 48, 0, -4.0F, -1.5F, 0.0F, 8, 2, 9, 0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 2.5F, 4.5F);
        this.BackSegment3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.1309F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 52, 28, -7.2631F, -4.1509F, -6.5F, 5, 0, 11, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 2.5F, 4.5F);
        this.BackSegment3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.3491F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 63, 22, -9.1342F, -5.606F, -4.5F, 3, 0, 10, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Arthropleura.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
