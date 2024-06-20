package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelNotostracan extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
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
    private final AdvancedModelRenderer thorax1;
    private final AdvancedModelRenderer thorax2;
    private final AdvancedModelRenderer thorax3;
    private final AdvancedModelRenderer abdomen1;
    private final AdvancedModelRenderer abdomen2;
    private final AdvancedModelRenderer uropodR;
    private final AdvancedModelRenderer uropodR2;
    private final AdvancedModelRenderer uropodL;
    private final AdvancedModelRenderer uropodL2;
    private final AdvancedModelRenderer thoracopod9R;
    private final AdvancedModelRenderer thoracopod10R;
    private final AdvancedModelRenderer thoracopod10L;
    private final AdvancedModelRenderer thoracopod9L;
    private final AdvancedModelRenderer thoracopod8R;
    private final AdvancedModelRenderer thoracopod7R;
    private final AdvancedModelRenderer thoracopod8L;
    private final AdvancedModelRenderer thoracopod7L;
    private final AdvancedModelRenderer thoracopod5L;
    private final AdvancedModelRenderer thoracopod5R;
    private final AdvancedModelRenderer thoracopod6R;
    private final AdvancedModelRenderer thoracopod6L;
    private final AdvancedModelRenderer thoracopod2L;
    private final AdvancedModelRenderer thoracopod3L;
    private final AdvancedModelRenderer thoracopod4L;
    private final AdvancedModelRenderer thoracopod2R;
    private final AdvancedModelRenderer thoracopod3R;
    private final AdvancedModelRenderer thoracopod4R;
    private final AdvancedModelRenderer thoracopod1L;
    private final AdvancedModelRenderer thoracopod1R;

    public ModelNotostracan() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 21.5F, 0.1F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.5F, -2.65F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 5, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.25F, -0.5225F, -4.4599F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6021F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 12, -0.75F, 0.2139F, -1.2993F, 1, 0, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.7994F, -1.4976F, -1.3022F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 11, -1.2994F, 0.3F, -3.0F, 1, 0, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.4994F, -2.7F, 3.9F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3271F, 0.2213F, -0.5742F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, -5.0F, 0.0F, -3.0F, 5, 0, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.4994F, -1.7F, 1.7F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1434F, -0.0998F, 0.6037F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 0, -0.0127F, -0.0182F, -5.9918F, 5, 0, 6, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.4994F, -2.7F, 3.9F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3271F, -0.2213F, 0.5742F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 12, 0.0F, 0.0F, -3.0F, 5, 0, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.6822F, -4.2047F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5651F, 0.0142F, -0.6553F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -2.8883F, 0.001F, -2.5871F, 3, 0, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -0.6822F, -4.2047F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5651F, -0.0142F, 0.6553F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.1117F, 0.001F, -2.5871F, 3, 0, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.4994F, -1.7F, 1.7F);
        this.Body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1434F, 0.0998F, -0.6037F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 0, -4.9873F, -0.0182F, -5.9918F, 5, 0, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.4668F, -0.0013F);
        this.Body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 19, -1.0F, -0.6084F, -3.0257F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.3F, -2.8F);
        this.Body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, -3, 23, -2.5F, -0.05F, -3.05F, 5, 0, 3, 0.0F, false));

        this.thorax1 = new AdvancedModelRenderer(this);
        this.thorax1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addChild(thorax1);
        this.thorax1.cubeList.add(new ModelBox(thorax1, 18, 11, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.thorax2 = new AdvancedModelRenderer(this);
        this.thorax2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.thorax1.addChild(thorax2);
        this.thorax2.cubeList.add(new ModelBox(thorax2, 0, 19, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));
        this.thorax2.cubeList.add(new ModelBox(thorax2, 12, 6, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.thorax3 = new AdvancedModelRenderer(this);
        this.thorax3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.thorax2.addChild(thorax3);
        this.thorax3.cubeList.add(new ModelBox(thorax3, 16, 15, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));
        this.thorax3.cubeList.add(new ModelBox(thorax3, 20, 0, -0.5F, -0.1F, 2.0F, 1, 0, 4, 0.0F, false));
        this.thorax3.cubeList.add(new ModelBox(thorax3, 0, 27, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.abdomen1 = new AdvancedModelRenderer(this);
        this.abdomen1.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.thorax3.addChild(abdomen1);
        this.abdomen1.cubeList.add(new ModelBox(abdomen1, 8, 15, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));
        this.abdomen1.cubeList.add(new ModelBox(abdomen1, 12, 6, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.abdomen2 = new AdvancedModelRenderer(this);
        this.abdomen2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.abdomen1.addChild(abdomen2);
        this.abdomen2.cubeList.add(new ModelBox(abdomen2, 0, 15, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.uropodR = new AdvancedModelRenderer(this);
        this.uropodR.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.abdomen2.addChild(uropodR);
        this.setRotateAngle(uropodR, 0.0F, -0.2182F, 0.0F);
        this.uropodR.cubeList.add(new ModelBox(uropodR, 0, 0, -1.0F, 0.0F, 0.0F, 1, 0, 10, 0.0F, false));

        this.uropodR2 = new AdvancedModelRenderer(this);
        this.uropodR2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.abdomen2.addChild(uropodR2);
        this.setRotateAngle(uropodR2, 0.0F, -0.2182F, 0.0F);
        this.uropodR2.cubeList.add(new ModelBox(uropodR2, 12, 0, -1.0F, 0.0F, 0.0F, 1, 0, 10, 0.0F, false));

        this.uropodL = new AdvancedModelRenderer(this);
        this.uropodL.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.abdomen2.addChild(uropodL);
        this.setRotateAngle(uropodL, 0.0F, 0.2182F, 0.0F);
        this.uropodL.cubeList.add(new ModelBox(uropodL, 0, 0, 0.0F, 0.0F, 0.0F, 1, 0, 10, 0.0F, true));

        this.uropodL2 = new AdvancedModelRenderer(this);
        this.uropodL2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.abdomen2.addChild(uropodL2);
        this.setRotateAngle(uropodL2, 0.0F, 0.2182F, 0.0F);
        this.uropodL2.cubeList.add(new ModelBox(uropodL2, 12, 0, 0.0F, 0.0F, 0.0F, 1, 0, 10, 0.0F, true));

        this.thoracopod9R = new AdvancedModelRenderer(this);
        this.thoracopod9R.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.thorax3.addChild(thoracopod9R);
        this.setRotateAngle(thoracopod9R, 0.0F, 0.0F, -0.3927F);
        this.thoracopod9R.cubeList.add(new ModelBox(thoracopod9R, -1, 4, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.thoracopod10R = new AdvancedModelRenderer(this);
        this.thoracopod10R.setRotationPoint(-1.0F, 1.0F, 1.0F);
        this.thorax3.addChild(thoracopod10R);
        this.setRotateAngle(thoracopod10R, 0.0F, 0.0F, -0.3927F);
        this.thoracopod10R.cubeList.add(new ModelBox(thoracopod10R, 0, 3, -1.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.thoracopod10L = new AdvancedModelRenderer(this);
        this.thoracopod10L.setRotationPoint(1.0F, 1.0F, 1.0F);
        this.thorax3.addChild(thoracopod10L);
        this.setRotateAngle(thoracopod10L, 0.0F, 0.0F, 0.3927F);
        this.thoracopod10L.cubeList.add(new ModelBox(thoracopod10L, 0, 3, 0.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, true));

        this.thoracopod9L = new AdvancedModelRenderer(this);
        this.thoracopod9L.setRotationPoint(1.0F, 1.0F, 0.0F);
        this.thorax3.addChild(thoracopod9L);
        this.setRotateAngle(thoracopod9L, 0.0F, 0.0F, 0.3927F);
        this.thoracopod9L.cubeList.add(new ModelBox(thoracopod9L, -1, 4, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.thoracopod8R = new AdvancedModelRenderer(this);
        this.thoracopod8R.setRotationPoint(-1.0F, 1.0F, 1.0F);
        this.thorax2.addChild(thoracopod8R);
        this.setRotateAngle(thoracopod8R, 0.0F, 0.0F, -0.3927F);
        this.thoracopod8R.cubeList.add(new ModelBox(thoracopod8R, -1, 5, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.thoracopod7R = new AdvancedModelRenderer(this);
        this.thoracopod7R.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.thorax2.addChild(thoracopod7R);
        this.setRotateAngle(thoracopod7R, 0.0F, 0.0F, -0.3927F);
        this.thoracopod7R.cubeList.add(new ModelBox(thoracopod7R, -1, 6, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.thoracopod8L = new AdvancedModelRenderer(this);
        this.thoracopod8L.setRotationPoint(1.0F, 1.0F, 1.0F);
        this.thorax2.addChild(thoracopod8L);
        this.setRotateAngle(thoracopod8L, 0.0F, 0.0F, 0.3927F);
        this.thoracopod8L.cubeList.add(new ModelBox(thoracopod8L, -1, 5, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.thoracopod7L = new AdvancedModelRenderer(this);
        this.thoracopod7L.setRotationPoint(1.0F, 1.0F, 0.0F);
        this.thorax2.addChild(thoracopod7L);
        this.setRotateAngle(thoracopod7L, 0.0F, 0.0F, 0.3927F);
        this.thoracopod7L.cubeList.add(new ModelBox(thoracopod7L, -1, 6, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.thoracopod5L = new AdvancedModelRenderer(this);
        this.thoracopod5L.setRotationPoint(1.0F, 1.0F, 0.0F);
        this.thorax1.addChild(thoracopod5L);
        this.setRotateAngle(thoracopod5L, 0.0F, 0.0F, 0.3927F);
        this.thoracopod5L.cubeList.add(new ModelBox(thoracopod5L, -1, 8, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.thoracopod5R = new AdvancedModelRenderer(this);
        this.thoracopod5R.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.thorax1.addChild(thoracopod5R);
        this.setRotateAngle(thoracopod5R, 0.0F, 0.0F, -0.3927F);
        this.thoracopod5R.cubeList.add(new ModelBox(thoracopod5R, -1, 8, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.thoracopod6R = new AdvancedModelRenderer(this);
        this.thoracopod6R.setRotationPoint(-1.0F, 1.0F, 1.0F);
        this.thorax1.addChild(thoracopod6R);
        this.setRotateAngle(thoracopod6R, 0.0F, 0.0F, -0.3927F);
        this.thoracopod6R.cubeList.add(new ModelBox(thoracopod6R, -1, 7, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.thoracopod6L = new AdvancedModelRenderer(this);
        this.thoracopod6L.setRotationPoint(1.0F, 1.0F, 1.0F);
        this.thorax1.addChild(thoracopod6L);
        this.setRotateAngle(thoracopod6L, 0.0F, 0.0F, 0.3927F);
        this.thoracopod6L.cubeList.add(new ModelBox(thoracopod6L, -1, 7, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.thoracopod2L = new AdvancedModelRenderer(this);
        this.thoracopod2L.setRotationPoint(0.6384F, 1.1947F, -2.9487F);
        this.Body.addChild(thoracopod2L);
        this.setRotateAngle(thoracopod2L, 0.1309F, 0.0F, 0.48F);
        this.thoracopod2L.cubeList.add(new ModelBox(thoracopod2L, -1, 11, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.thoracopod3L = new AdvancedModelRenderer(this);
        this.thoracopod3L.setRotationPoint(0.6986F, 1.0789F, -1.9572F);
        this.Body.addChild(thoracopod3L);
        this.setRotateAngle(thoracopod3L, 0.1309F, 0.0F, 0.48F);
        this.thoracopod3L.cubeList.add(new ModelBox(thoracopod3L, -1, 10, 0.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, true));

        this.thoracopod4L = new AdvancedModelRenderer(this);
        this.thoracopod4L.setRotationPoint(0.7589F, 0.9631F, -0.9658F);
        this.Body.addChild(thoracopod4L);
        this.setRotateAngle(thoracopod4L, 0.1309F, 0.0F, 0.48F);
        this.thoracopod4L.cubeList.add(new ModelBox(thoracopod4L, -1, 9, 0.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, true));

        this.thoracopod2R = new AdvancedModelRenderer(this);
        this.thoracopod2R.setRotationPoint(-0.6384F, 1.1947F, -2.9487F);
        this.Body.addChild(thoracopod2R);
        this.setRotateAngle(thoracopod2R, 0.1309F, 0.0F, -0.48F);
        this.thoracopod2R.cubeList.add(new ModelBox(thoracopod2R, -1, 11, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.thoracopod3R = new AdvancedModelRenderer(this);
        this.thoracopod3R.setRotationPoint(-0.6986F, 1.0789F, -1.9572F);
        this.Body.addChild(thoracopod3R);
        this.setRotateAngle(thoracopod3R, 0.1309F, 0.0F, -0.48F);
        this.thoracopod3R.cubeList.add(new ModelBox(thoracopod3R, -1, 10, -4.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.thoracopod4R = new AdvancedModelRenderer(this);
        this.thoracopod4R.setRotationPoint(-0.7589F, 0.9631F, -0.9658F);
        this.Body.addChild(thoracopod4R);
        this.setRotateAngle(thoracopod4R, 0.1309F, 0.0F, -0.48F);
        this.thoracopod4R.cubeList.add(new ModelBox(thoracopod4R, -1, 9, -4.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.thoracopod1L = new AdvancedModelRenderer(this);
        this.thoracopod1L.setRotationPoint(0.2F, 1.0F, -3.0F);
        this.Body.addChild(thoracopod1L);
        this.setRotateAngle(thoracopod1L, 0.0936F, -0.0981F, 0.2648F);
        this.thoracopod1L.cubeList.add(new ModelBox(thoracopod1L, 7, 24, -0.0713F, -0.0228F, -4.9452F, 6, 0, 8, 0.0F, true));

        this.thoracopod1R = new AdvancedModelRenderer(this);
        this.thoracopod1R.setRotationPoint(-0.2F, 1.0F, -3.0F);
        this.Body.addChild(thoracopod1R);
        this.setRotateAngle(thoracopod1R, 0.0936F, 0.0981F, -0.2648F);
        this.thoracopod1R.cubeList.add(new ModelBox(thoracopod1R, 7, 24, -5.9287F, -0.0228F, -4.9452F, 6, 0, 8, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.head.render(f5 * 0.25F);
        this.Body.render(f5);
    }
    public void renderStaticDisplayCase(float f) {
        this.Body.offsetY = -0.16F;
        this.Body.offsetX = -0.04F;
        this.Body.offsetZ = -0.25F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, -0.25F, 0.05F, 0.0F);
        this.setRotateAngle(thorax1, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(thorax2, 0.1F, -0.1F, 0.0F);
        this.setRotateAngle(thorax3, 0.1F, -0.15F, 0.0F);
        this.setRotateAngle(abdomen1, 0.1F, -0.15F, 0.0F);
        this.setRotateAngle(abdomen2, 0.1F, -0.15F, 0.0F);
        this.Body.offsetY = -0.0799F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {

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
        AdvancedModelRenderer[] fishTail = {this.thorax1, this.thorax2, this.thorax3, this.abdomen1, this.abdomen2};
        AdvancedModelRenderer[] legsL = {this.thoracopod1L, this.thoracopod2L, this.thoracopod3L, this.thoracopod4L, this.thoracopod5L, this.thoracopod6L, this.thoracopod7L, this.thoracopod8L, this.thoracopod9L, this.thoracopod10L};
        AdvancedModelRenderer[] legsR = {this.thoracopod1R, this.thoracopod2R, this.thoracopod3R, this.thoracopod4R, this.thoracopod5R, this.thoracopod6R, this.thoracopod7R, this.thoracopod8R, this.thoracopod9R, this.thoracopod10R};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.025F, -3, f2, 1);
            this.chainSwing(fishTail, speed*0.5F, 0.075F, -3, f2, 0.7F);
            this.swing(uropodL, speed, 0.05F, false, 0, 0, f2, 1F);
            this.swing(uropodR, speed, 0.05F, true, 0, -0, f2, 1F);
            this.chainFlap(legsL, speed, -0.4F, -3, f2, 1F);
            this.chainFlap(legsR, speed, 0.4F, -3, f2, 1F);
            //this.swing(bone, speed, 0.35F, true, 0, -0F, f2, 0.3F);
            //this.swing(antennaR, speed, -0.35F, true, 0, -0F, f2, 0.3F);
            this.swing(Body, speed, 0.025F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Body.rotateAngleZ = (float) Math.toRadians(90);
                //this.Body.offsetY = 1.07F;
                this.bob(Body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
