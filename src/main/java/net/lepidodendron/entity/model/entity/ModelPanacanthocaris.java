package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPanacanthocaris extends AdvancedModelBase {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer thorax1;
    private final AdvancedModelRenderer thorax2;
    private final AdvancedModelRenderer thorax3;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer telson;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer uropodL;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer uropodR;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer thoracopod9R;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer thoracopod9L;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer thoracopod8R;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer thoracopod8L;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer thoracopod7R;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer thoracopod7L;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer thoracopod6R;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer thoracopod6L;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer thoracopod5L;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer thoracopod5R;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaR_2;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer thoracopod1R;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer thoracopod2R;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer thoracopod3R;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer thoracopod4R;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer thoracopod1L;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer thoracopod2L;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer thoracopod3L;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer thoracopod4L;
    private final AdvancedModelRenderer cube_r25;

    public ModelPanacanthocaris() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(1.1148F, 22.5668F, -0.0279F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.1148F, -0.8668F, 1.7779F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0852F, -0.0189F, 0.2174F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 15, 0.0F, 0.0F, -6.0F, 5, 0, 7, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.1148F, -0.8668F, 1.7779F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0852F, 0.0189F, -0.2174F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 15, -5.0F, 0.0F, -6.0F, 5, 0, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.1148F, -0.6168F, -0.9221F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0785F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 22, -1.5F, -0.05F, 0.95F, 3, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 22, -1.5F, -0.05F, -2.05F, 3, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 11, -2.5F, -0.05F, -1.05F, 5, 1, 2, 0.0F, false));

        this.thorax1 = new AdvancedModelRenderer(this);
        this.thorax1.setRotationPoint(-1.1148F, -0.0668F, 1.0279F);
        this.Body.addChild(thorax1);
        this.thorax1.cubeList.add(new ModelBox(thorax1, 6, 22, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.thorax2 = new AdvancedModelRenderer(this);
        this.thorax2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.thorax1.addChild(thorax2);
        this.thorax2.cubeList.add(new ModelBox(thorax2, 0, 20, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.thorax3 = new AdvancedModelRenderer(this);
        this.thorax3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.thorax2.addChild(thorax3);
        this.thorax3.cubeList.add(new ModelBox(thorax3, 17, 19, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.thorax3.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 17, 16, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.abdomen.addChild(telson);
        this.telson.cubeList.add(new ModelBox(telson, 0, 4, -1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.telson.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.2182F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.8681F, -0.7046F, 1.0F, 2, 0, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.telson.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.2182F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -2.8681F, -0.7046F, 1.0F, 2, 0, 4, 0.0F, false));

        this.uropodL = new AdvancedModelRenderer(this);
        this.uropodL.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.telson.addChild(uropodL);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.uropodL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2182F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, 0.0F, 0.0F, 1, 0, 11, 0.0F, true));

        this.uropodR = new AdvancedModelRenderer(this);
        this.uropodR.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.telson.addChild(uropodR);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.uropodR.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.2182F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.0F, 0.0F, 0.0F, 1, 0, 11, 0.0F, false));

        this.thoracopod9R = new AdvancedModelRenderer(this);
        this.thoracopod9R.setRotationPoint(-1.0F, 0.5F, 0.0F);
        this.thorax3.addChild(thoracopod9R);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod9R.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.3927F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -1.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.thoracopod9L = new AdvancedModelRenderer(this);
        this.thoracopod9L.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.thorax3.addChild(thoracopod9L);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod9L.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.3927F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, true));

        this.thoracopod8R = new AdvancedModelRenderer(this);
        this.thoracopod8R.setRotationPoint(-1.0F, 0.5F, 1.0F);
        this.thorax2.addChild(thoracopod8R);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod8R.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.3927F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 1, -1.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.thoracopod8L = new AdvancedModelRenderer(this);
        this.thoracopod8L.setRotationPoint(1.0F, 0.5F, 1.0F);
        this.thorax2.addChild(thoracopod8L);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod8L.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3927F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 1, 0.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, true));

        this.thoracopod7R = new AdvancedModelRenderer(this);
        this.thoracopod7R.setRotationPoint(-1.0F, 0.5F, 0.0F);
        this.thorax2.addChild(thoracopod7R);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod7R.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.3927F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 6, 4, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.thoracopod7L = new AdvancedModelRenderer(this);
        this.thoracopod7L.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.thorax2.addChild(thoracopod7L);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod7L.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.3927F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 6, 4, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.thoracopod6R = new AdvancedModelRenderer(this);
        this.thoracopod6R.setRotationPoint(-1.0F, 0.5F, 1.0F);
        this.thorax1.addChild(thoracopod6R);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod6R.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.3927F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 14, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.thoracopod6L = new AdvancedModelRenderer(this);
        this.thoracopod6L.setRotationPoint(1.0F, 0.5F, 1.0F);
        this.thorax1.addChild(thoracopod6L);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod6L.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.3927F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 14, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.thoracopod5L = new AdvancedModelRenderer(this);
        this.thoracopod5L.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.thorax1.addChild(thoracopod5L);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod5L.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.3927F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 14, 0.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, true));

        this.thoracopod5R = new AdvancedModelRenderer(this);
        this.thoracopod5R.setRotationPoint(-1.0F, 0.5F, 0.0F);
        this.thorax1.addChild(thoracopod5R);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod5R.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.3927F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 14, -4.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-1.3057F, -0.0677F, -3.0177F);
        this.Body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0726F, 0.03F, -0.3916F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 0, -4.97F, -0.0725F, -13.9969F, 5, 0, 14, 0.0F, false));

        this.antennaR_2 = new AdvancedModelRenderer(this);
        this.antennaR_2.setRotationPoint(-4.97F, -0.0735F, -13.9969F);
        this.antennaR.addChild(antennaR_2);
        this.antennaR_2.cubeList.add(new ModelBox(antennaR_2, -8, 25, -5.0F, 0.001F, -1.0F, 5, 0, 8, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-0.9239F, -0.0677F, -3.0177F);
        this.Body.addChild(bone);
        this.setRotateAngle(bone, 0.0726F, -0.03F, 0.3916F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -0.03F, -0.0725F, -13.9969F, 5, 0, 14, 0.0F, true));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(4.97F, -0.0735F, -13.9969F);
        this.bone.addChild(bone2);
        this.bone2.cubeList.add(new ModelBox(bone2, -8, 25, 0.0F, 0.001F, -1.0F, 5, 0, 8, 0.0F, true));

        this.thoracopod1R = new AdvancedModelRenderer(this);
        this.thoracopod1R.setRotationPoint(-2.2296F, 0.2354F, -2.9908F);
        this.Body.addChild(thoracopod1R);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod1R.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0726F, 0.03F, -0.3916F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 15, -4.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.thoracopod2R = new AdvancedModelRenderer(this);
        this.thoracopod2R.setRotationPoint(-2.2296F, 0.1569F, -1.9938F);
        this.Body.addChild(thoracopod2R);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod2R.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0726F, 0.03F, -0.3916F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 9, -5.0F, 0.0F, 0.0F, 5, 0, 1, 0.0F, false));

        this.thoracopod3R = new AdvancedModelRenderer(this);
        this.thoracopod3R.setRotationPoint(-2.2296F, 0.0785F, -0.9969F);
        this.Body.addChild(thoracopod3R);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod3R.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0726F, 0.03F, -0.3916F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 10, -5.0F, 0.0F, 0.0F, 5, 0, 1, 0.0F, false));

        this.thoracopod4R = new AdvancedModelRenderer(this);
        this.thoracopod4R.setRotationPoint(-2.2296F, 0.0F, 0.0F);
        this.Body.addChild(thoracopod4R);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod4R.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0726F, 0.03F, -0.3916F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 8, -5.0F, 0.0F, 0.0F, 5, 0, 1, 0.0F, false));

        this.thoracopod1L = new AdvancedModelRenderer(this);
        this.thoracopod1L.setRotationPoint(0.0F, 0.2354F, -2.9908F);
        this.Body.addChild(thoracopod1L);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod1L.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0726F, -0.03F, 0.3916F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 16, 15, 0.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, true));

        this.thoracopod2L = new AdvancedModelRenderer(this);
        this.thoracopod2L.setRotationPoint(0.0F, 0.1569F, -1.9938F);
        this.Body.addChild(thoracopod2L);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod2L.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0726F, -0.03F, 0.3916F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 9, 0.0F, 0.0F, 0.0F, 5, 0, 1, 0.0F, true));

        this.thoracopod3L = new AdvancedModelRenderer(this);
        this.thoracopod3L.setRotationPoint(0.0F, 0.0785F, -0.9969F);
        this.Body.addChild(thoracopod3L);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod3L.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0726F, -0.03F, 0.3916F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 10, 0.0F, 0.0F, 0.0F, 5, 0, 1, 0.0F, true));

        this.thoracopod4L = new AdvancedModelRenderer(this);
        this.thoracopod4L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addChild(thoracopod4L);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thoracopod4L.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0726F, -0.03F, 0.3916F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 8, 0.0F, 0.0F, 0.0F, 5, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.head.render(f5 * 0.25F);
        this.Body.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Body.rotateAngleY = (float) Math.toRadians(90);
        this.Body.offsetX = -0.F;
        this.Body.offsetY = -0F;
        this.Body.offsetZ = 0.0F;
        this.Body.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Body.offsetY = 1.17F;
        //this.gill.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.gill.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.thorax1, this.thorax2, this.thorax3, this.abdomen, this.telson};
        AdvancedModelRenderer[] legsL = {this.thoracopod1L, this.thoracopod2L, this.thoracopod3L, this.thoracopod4L, this.thoracopod5L, this.thoracopod6L, this.thoracopod7L, this.thoracopod8L, this.thoracopod9L};
        AdvancedModelRenderer[] legsR = {this.thoracopod1R, this.thoracopod2R, this.thoracopod3R, this.thoracopod4R, this.thoracopod5R, this.thoracopod6R, this.thoracopod7R, this.thoracopod8R, this.thoracopod9R};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed*0.5F, 0.25F, -3, f2, 0.7F);
            this.swing(uropodL, speed, 0.05F, false, 0, 0, f2, 1F);
            this.swing(uropodR, speed, 0.05F, true, 0, -0, f2, 1F);
            this.chainSwing(legsL, speed, 0.1F, -3, f2, 0.7F);
            this.chainSwing(legsR, speed, 0.1F, -3, f2, 0.7F);
            this.swing(bone, speed, 0.35F, true, 0, -0F, f2, 0.3F);
            this.swing(antennaR, speed, -0.35F, true, 0, -0F, f2, 0.3F);
            //this.swing(Body, speed, 0.15F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Body.rotateAngleZ = (float) Math.toRadians(90);
                //this.Body.offsetY = 1.07F;
                this.bob(Body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
